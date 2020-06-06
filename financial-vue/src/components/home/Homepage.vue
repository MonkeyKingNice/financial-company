<template>
  <div>
    <img class="HomePageImg" :src="homePageImg">
  </div>
</template>

<script>
export default {
  name: 'HomePage',
  data () {
    return {
      homePageImg: '../../../../static/home_page_imgs/homePage.jpg'
    }
  },

  created () {

  },

  computed: {},

  methods: {}
}
</script>
<style>
  .HomePageImg{
    width: auto;
    height: auto;
    max-width: 100%;
    max-height: 100%;
  }
</style>
