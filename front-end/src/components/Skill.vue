<template>

  <div style="width: 60vh;">
      <div class="content">
        <div class="skill">
          <div v-if="!editEnabled && !isDeleted">
            <h2>Skill: </h2>
            <h4>{{ skillName }}</h4>
            <h3>Skill level: </h3>
            <h5>{{ rating }} / 10</h5>
            <h3>Comment: </h3>
            <h5> {{ comment }} </h5>
          </div>
          <div v-if="editEnabled">
            <form id="skillsForm" @submit.prevent="save">
              <h3>Skill: </h3>
              <input type="text" v-model="formSkill" class="skillInput">
              <h5>Skill level: </h5>
              <input type="number" max="10" min="0" v-model="formrating" class="ratingInput">
              <h5>Comment: </h5>
            </form>
            <textarea v-model="formComment" form="skillsForm" class="commentInput"></textarea>

          </div>
          <div class="buttons">
            <button v-if="!editEnabled && !isDeleted" @click="toggleEdit" class="editButton">edit</button>
            <button type="submit" form="skillsForm" v-if="editEnabled" class="editButton">save</button>
            <button v-if="editEnabled" @click="cancel" class="editButton">cancel</button>
            <button v-if="editEnabled" @click="remove" class="editButton">delete</button>
          </div>
        </div>
      </div>
  </div>

</template>

<script>
  export default {
    name: "Skill",
    data: function() {
      return {
        editEnabled: false,
        isDeleted: false,
        formSkill: this.skillName,
        formrating: this.rating,
        formComment: this.comment
      };
    },
    props: {
      id: Number,
      skillName: String,
      rating: Number,
      comment: String
    },
    methods: {
      toggleEdit() {
        this.editEnabled = true;
      },
      cancel() {
        this.editEnabled = false;
        this.formSkill = this.skillName;
        this.formrating = this.rating;
        this.formComment = this.comment;
      },
      save() {

        const reqHeaders = {
          'Content-Type': 'application/json'
        };

        this.editEnabled = false;
        this.skillName = this.formSkill;
        this.rating = this.formrating;
        this.comment = this.formComment;

        const skillJson = JSON.stringify({
          id: this.id,
          skill: this.skillName,
          rating: this.rating,
          skillComment: this.comment
        });

        this.axios.post("http://localhost:8080/skills", skillJson, {headers: reqHeaders})
          .then(response => console.log(response));

      },
      remove() {
        console.log(this.id);
        this.isDeleted = true;
        this.editEnabled = false;
        this.axios.delete("http://localhost:8080/skills/" + this.id);
      }
    }
  }
</script>

<style scoped>

  .content {
    font-weight: bolder;
    text-align: left;
    margin-left: 6vh;
  }

  .skill {
    display: flex;
    flex-direction: column;
    padding: 2vh;
  }

  .buttons {
    display: flex;
  }

  .editButton {
    margin: 2vh;
    width: 10vh;
    height: 4vh;
    border-radius: 2vh;
    border: 2px solid rgb(0, 3, 127);
    color: rgb(0, 3, 127);
    background-color: transparent;
  }

  .ratingInput {
    height: 4vh;
    width: 6vh;
  }

  .commentInput {
    width: 25vh;
    height: 10vh;
  }

  .skillInput {
    width: 25vh;
  }


</style>