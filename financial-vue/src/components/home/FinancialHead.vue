<template>
  <div>
    <div class="head-log">
      <img :src="headLogImg">
    </div>
    <div class="head-slogan">
      <p>与逐梦者同行，一站式企业服务</p>
    </div>
    <div class="head-nav">
      <ul>
        <li>佰税通</li>
        <li>网站首页</li>
        <li>一站式服务</li>
        <li>公司理念</li>
        <li>关于我们</li>
        <li>联系我们</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: 'FinancialHead',
  data () {
    return {
      headLogImg: '../../../../static/head_logo_imgs/logo.png'
    }
  },
  created () {

  },

  computed: {},

  methods: {}
}
</script>

<style>
.head-log{float: left;}
.head-slogan{float: left;}
.head-nav{

}
  ul{
    list-style-type:none;
    margin:0;
    padding:0;
    }
  li{
    float:left;
    width:120px;
  }
</style>
