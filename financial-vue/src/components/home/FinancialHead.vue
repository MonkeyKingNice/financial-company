<template>
  <div>
    <nav class="financia-nav">
      <div class="head-log">
        <img :src="headLogImg" />
      </div>
      <div class="head-slogan">
        <p>与逐梦者同行，一站式企业服务</p>
      </div>
      <div class="nav-head">
        <!-- <li><big><b>佰税通</b></big></li> -->
        <li><b>网站首页</b></li>
        <li><b>一站式服务</b></li>
        <li><b>公司理念</b></li>
        <li><b>关于我们</b></li>
        <li><b>联系我们</b></li>
      </div>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'FinancialHead',
  data () {
    return {
      headLogImg: '../../../../static/images/head_logo_imgs/logo.png'
    }
  },
  created () { },

  computed: {},

  methods: {}
}
</script>

<style>
.financia-nav {
  /* display: inline-block; */
}
.head-log {
  float: left;
}
.head-slogan {
  float: left;
}

.nav-head li {
  display: inline-block;
  width: 120px;
  height: 51px;
  text-align: center;
  line-height: 51px;
}
.nav-head li:hover {
  color: white;
  background-color: #11278a;
  cursor: pointer;
  font-weight: bold;
}
</style>
