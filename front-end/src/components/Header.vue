<template>
  <div>
    <div class="home">
      <a href="" @click="toHome">Home</a>
    </div>
    <div class="navigation">
      <a href="" @click="routeToAbout">About me</a>
      <a href="" @click="routeToSkills">Skills</a>
      <a href="" @click="routeToContact">Contact</a>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Header",
    methods: {
      routeToSkills() {
        this.$router.push('/skills');
      },
      routeToContact() {
        this.$router.push('/contact');
      },
      toHome() {
        this.$router.push('/');
      },
      routeToAbout() {
        this.$router.push('/about');
      }
    }
  }
</script>

<style scoped>

  .navigation {
    position: fixed;
    right: 3vh;
    top: 4vh;
    z-index: 200;
  }

  a {
    padding: 4vh;
    text-decoration: none;
    font-size: 4vh;
  }
  
  .home {
    position: fixed;
    z-index: 200;
    top: 4vh;
  }





</style>