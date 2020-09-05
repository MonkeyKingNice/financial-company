<template>
  <div class="financia-nav">
    <div class="wrap">
      <div class="logo">
        <img :src="headLogImg" />
        <!--<label>佰税通</label>-->
        <span>与逐梦者同行，一站式企业服务</span>
      </div>
      <div class="nav-head">
        <ul>
          <li v-for="(item,index) in topNav" :key="index" :class="{active : activeBtn == index}" @click="goAnchor('#anchor-'+index,index)">{{item}}</li>
          <!--<li class="active"><a href="/">网站首页</a></li>
          <li><a href="/">一站式服务</a></li>
          <li><a href="/">公司理念</a></li>
          <li><a href="/">关于我们</a></li>
          <li><a href="/">联系我们</a></li>-->
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
// import { mapActions } from 'vuex'
export default {
  name: 'FinancialHead',
  data () {
    return {
      headLogImg: '../../../../static/images/head_logo_imgs/logo.svg',
      topNav: ['网站首页', '一站式服务', '关于我们', '联系我们'],
      activeBtn: 0
    }
  },
  mounted () {
    this.dataInit()
  },
  created () { },

  computed: {},

  methods: {
    // ...mapActions('v2-score-preview', [
    //   'fetchClassScoreData',
    //   'fetchPersonalReportData',
    //   'fetchErrorQuestionData',
    //   'fetchExerciseData'
    // ]),
    // // 初始化
    // dataInit () {
    //   this.fetchClassScoreData()
    //   this.fetchPersonalReportData()
    //   this.fetchErrorQuestionData()
    //   this.fetchExerciseData()
    // },
    // // 锚点跳转
    // goAnchor (selector, index) {
    //   this.activeBtn = index
    //   document.querySelector('#app-root').scrollTop = this.$el.querySelector(selector).offsetTop
    // }
  }
}
</script>

<style scoped>
.financia-nav {
  position: fixed; top: 0; z-index: 99; width: 100%; background: #fff; box-shadow: 0 2px 18px rgba(0,0,0,.05);
}
.financia-nav .wrap{ display: flex; align-items: center; justify-content: space-between;}
.financia-nav .logo{ display: flex; align-items: center;}
.financia-nav .logo img{ width: 100px;}
.financia-nav .logo label{font-size: 1.7rem;}
.financia-nav .logo span{ margin-left: 40px; padding-left: 30px; border-left: 1px solid #eee; line-height: 1; color: #999}
.nav-head ul {display: flex; align-items: center;}
.nav-head li {
  margin-left: 60px; padding: 0 5px; height: 90px;display: flex; align-items: center; position: relative;
  font-size: 1.1em;
}
.nav-head li:hover {
  cursor: pointer;
  color: #004098;
}
.nav-head li:hover:after,.nav-head li.active:after{ content: "";
  position: absolute;
  left: 0;
  width: 100%;
  height: 3px;
  background: #004098;
  top: 0;
  -webkit-transition: all .2s ease-in;
  transition: all .2s ease-in;}
</style>
