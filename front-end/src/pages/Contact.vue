<template>
  <div class="body">
    <Header />

    <div class="container">
      <div class="content">
        <div>
          <h2>Telephone number: </h2>
          <p>+372 51963118</p>
        </div>
        <div>
          <h2>E-mail: </h2>
          <p>joosepnoot@gmail.com</p>
        </div>
        <div>
          <h2>Send a letter: </h2>
          <p>Tuule 18, Saku, Harjumaa</p>
        </div>
      </div>
      <div class="links">
        <a href="https://www.linkedin.com/in/joosep-noot-4387a017a/">
          <img src="../../public/linkedin.svg" alt="linkedin" class="linkedin">
        </a>
        <a href="https://www.linkedin.com/in/joosep-noot-4387a017a/">LinkedIn</a>
      </div>
    </div>

  </div>
</template>

<script>
  import Header from "../components/Header";
  export default {
    name: "Contact",
    components: {Header}
  }
</script>

<style scoped>

  .content {
    position: relative;
    top: 10vh;
    display: flex;
    justify-content: space-around;
  }

  .content p {
    font-size: 18px;
  }

  .linkedin {
    height: 5vh;
  }

  .links {
    margin-top: 30vh;
  }

  .links a {
    text-decoration: none;
    color: #e8ffd8;
    margin: 1vh;
  }

  .container {
    position: absolute;
    top: 150px;
    left: 0px;
    right: 0px;
    bottom: 0px;
  }


</style>