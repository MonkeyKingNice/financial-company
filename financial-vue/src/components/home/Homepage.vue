<template>
  <div>
    <img class="HomePageImg"
         :src="homePageImg">
  </div>
</template>

<script>
export default {
  name: 'HomePage',
  data () {
    return {
      homePageImg: '../../../../static/images/banner.png'
    }
  },

  created () {

  },

  computed: {},

  methods: {}
}
</script>
<style>
.HomePageImg {
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
  margin-top: 90px;
}
</style>
