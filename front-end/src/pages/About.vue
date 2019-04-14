<template>
  <div>

    <Header />

    <div class="container">
      <div class="content">
        <div class="paragraph">
          <h2>My journey to IT</h2>
          <p>
            Before university, I went to high school in Saku. I graduated with a gold medal which means all my grades
            were 5. However, I wasn't extremely skilled in any particular subject, so it was quite hard to decide what
            should I study in university. I didn't like any of the available specialities, so I decided to apply for IT.
            I also signed myself up to join the Estonian Defense Forces, because I wanted to eliminate one unpleasant
            responsibility, so I wouldn't have to worry about it in future. Also, it gave me another year to think
            about my future studies at university.
            <br><br>
            Serving my time was a quite unpleasant experience for me, but if I rethink about it, I actually
            learned many useful skills there. Doing something, that's not pleasant for you but just needs to be done,
            is one of them. Also, I learned how to perform under pressure, take responsibility and to be honest.
            These are definitely the qualities which are also important in IT.
            <br><br>
            I also made some new friends who had been studying IT before and talking with them gave me the courage
            and interest to try it as well.
          </p>
        </div>

        <div class="paragraph">
          <h2>My achievements</h2>
          <p>
            The beginning of my studies was quite hard for me because I tried to excel at everything. Since I had no
            previous experience in programming or anything else related to IT, it gave me a lot of stress and sleepless
            nights. Fortunately, the results reflected my effort. My results were quite a lot above the average. Also,
            I have got <span class="highlight">TalTech's IT scholarship </span> in every term.
            <br><br>
            However, now when it's almost the end of the second year of my studies, I feel that I need more. I can see
            that my friends, who have been to an internship or are working, are more experienced. So this winter, I
            decided that I want some real job and teamwork experience too. For a start, I attended TransferWise
            Hackathon. My teammates were extremely skilled and the teamwork was amazing. The jury also liked our idea
            and how we worked together and we got <span class="highlight">2nd place at TransferWise Hackathon.</span>
            This award gave me a lot of self-confidence to keep improving my skills in IT.
            <br><br>
            Therefore, I am looking for an internship in a valued IT company. I hope to improve my skills in an
            internship and prove my willingness to learn. If I manage to prove my value, I hope to keep working after
            finishing my internship.
          </p>
        </div>

      </div>
    </div>

  </div>
</template>

<script>
  import Header from "../components/Header";

  export default {
    name: "About",
    components: {
      Header
    }
  }
</script>

<style scoped>

  .container {
    position: absolute;
    top: 25vh;
    left: 0px;
    right: 0px;
    bottom: 0px;
    overflow-y: scroll;
  }

  .paragraph {
    margin: 5vh;
    font-weight: bold;
    text-align: left;
    width: 140vh;
  }

  .paragraph h2 {
    font-weight: bolder;
  }

  .highlight {
    font-weight: bolder;
    color: black;
  }

</style>