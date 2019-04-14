<template>

  <div>

    <Header />

    <div class="content">
      <div class="container">
        <Skill v-for="s in skills"
               :key="s.id"
               :id="s.id"
               :skillName="s.skill"
               :rating="s.rating"
               :comment="s.skillComment"/>
      </div>
    </div>

  </div>

</template>

<script>

  import Header from "../components/Header";
  import Skill from "../components/Skill";

  export default {
    name: "Skills",
    components: {
      Skill,
      Header
    },
    data: function() {
      return {
        skills: Array
      };
    },
    props: {
    },
    created() {
      this.axios.get('http://localhost:8080/fetchAll')
        .then(response => this.skills = response.data)
    }
  }
</script>

<style scoped>

  .content {
    position: absolute;
    top: 25vh;
    left: 0px;
    right: 0px;
    bottom: 0px;
    overflow-y: scroll;
  }

  .container {
    display: flex;
    flex-wrap: wrap;
  }

</style>