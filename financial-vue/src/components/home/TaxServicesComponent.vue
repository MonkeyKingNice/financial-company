<template>
  <div>
    <a href="javascript:void(0)"
       title="">
      <div class="imgs"><img src="img/i_img1.jpg"
             alt="" />
        <div class="txts">
          <h3 class="f24 h3">公司注册</h3>
        </div>
      </div>
    </a>
    <div class="dl">
      <dl>
        <dd v-for="(item, index) in jsonData.sonService"
            :key="item.sonServiceName">
          {{index}}-{{item}}
          <a href=""
             target="_blank"
             title="item.sonServiceName">
            <p>{{item.sonServiceName}}</p>
          </a>
          <!-- <a href="http://www.yingtaicaiwu.com/fuwu1.html"
             target="_blank"
             title="外资公司">
            <p>外资公司</p>
          </a> -->
        </dd>
      </dl>
    </div>

  </div>
</template>

<script>
export default {
  name: 'TaxServicesComponent',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  props: {
    jsonData: Object
  },
  components: {

  },
  created () {

  },

  computed: {

  },

  methods: {}
}
</script>
<style>
</style>
