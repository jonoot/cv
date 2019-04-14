<template>
  <div>
    <Header class="x" />
    <div class="content">
      <IndexBody />
      <button @click="routeToAbout" class="readMoreButton">Read more</button>
    </div>
  </div>
</template>

<script>

  import Header from "../components/Header";
  import IndexBody from "../components/IndexBody";

export default {
  name: 'Index',
  components: {
    Header,
    IndexBody
  },
  props: {
    msg: String
  },
  methods: {
    routeToAbout() {
      this.$router.push('/about');
    }
  }
}
</script>


<style scoped>
  h3 {
    margin: 40px 0 0;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }

  .content {
    position: relative;
    top: 20vh;
  }

  .readMoreButton {
    margin: 2vh;
    width: 16vh;
    height: 6vh;
    border-radius: 5vh;
    border: 2px solid rgb(0, 3, 127);
    color: rgb(0, 3, 127));
    font-weight: bolder;
    background-color: transparent;
  }

</style>
