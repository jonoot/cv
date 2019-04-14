<template>
  <div class="index-body">

    <img src="../../public/profile-pic.png" alt="profile-pic">
    <div class="content">
      <h2>
        Joosep Noot
      </h2>
      <p>I am 21 years old Computer Science student from Estonia. I have been studying Computer Science for two years
      in Tallinn University of Tech. Right now, I am looking for a internship to improve my skills in summer. This
      website was made to give a brief overview of me and my skills.</p>
    </div>

  </div>
</template>

<script>
  export default {
    name: "IndexBody"
  }
</script>

<style scoped>

  img {
    height: 20vh;
  }

  p {
    max-width: 90vh;
    font-size: 18px;
  }

  .content {
    text-align: -webkit-center;
  }

</style>