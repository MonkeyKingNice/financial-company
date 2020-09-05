<template>
  <div class="footer">
    <footer>
      <div class="f_bg"
           id="contact">
        <div class="f_bg_div">
          <div class="w">
            <div class="imgs">
              <img src="../../../static/images/head_logo_imgs/logo-f.svg" alt="">
<!--              <label>佰税通</label>-->
              <span>一站式商业服务平台</span>
            </div>
            <h3 class="h3">深圳佰税通企业登记代理有限公司</h3>
            <div class="links">
              <ul>
                <li><a href="javascript:void(0)"
                     title="工商注册">工商注册</a></li>
                <li><a href="javascript:void(0)"
                     title="财会税务">财会税务</a></li>
                <li><a href="javascript:void(0)"
                     title="知识产权">知识产权</a></li>
                <li><a href="javascript:void(0)"
                     title="公司注册">公司注册</a></li>
                <li><a href="javascript:void(0)"
                     title="工商变更">工商变更</a></li>
                <li><a href="javascript:void(0)"
                     title="公司转让">公司转让</a></li>
              </ul>
            </div>
          </div>

          <div class="f_div2_r2">
            <h2 class="h2">联系我们</h2>
            <div class="f_link">
              <ul>
                <li class="bgs1">售后qq：<a href="tencent://message/?uin=1033619971&amp;Site=qq&amp;Menu=yes">1050611601</a></li>
                <li class="bgs2">手机/微信：<a href="tel:13828787312">15118810218</a></li>
                <li class="bgs4">公司地址：深圳市南山区南山街道南光社区创业路18号怡海广场东、西座东-2806</li>
              </ul>
            </div>
          </div>
          <div class="c_l"></div>

        </div>
        <div class="f_div3">
          <div class="f_bg_div">
            <span class="l">Copyright©2010-2020 深圳佰税通企业登记代理有限公司 版权所有</span>
<!--            <span class="r"><a href="http://beian.miit.gov.cn"-->
<!--                 target="_blank">粤ICP备15118810218号</a></span>-->
          </div>
        </div>

      </div>
    </footer>
  </div>
</template>

<script>
export default {
  name: 'ContactUs',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  components: {

  },
  created () {

  },

  computed: {},

  methods: {}
}
</script>
<style>
.f_bg {
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  background: #373737;
  color: #999999;
  clear: both;
  padding-top: 50px;
  font-size: 15px;
}
.f_bg_div {
  color: #999999;
  font-size: 15px;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  width: 96%;
  max-width: 1200px;
  margin: 0 auto;
}
.w {
  color: #999999;
  font-size: 15px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  margin-right: 2%;
  float: left;
  max-width: 376px;
  width: 48%;
}
.imgs {
  color: #999999;
  font-size: 15px;
  margin: 20px 0 0 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  display: flex;
  align-items: center;
}

.imgs label{font-size: 2.5rem; color: #fff}
.imgs img{width: 120px;}
.imgs span{ margin-left: 40px; padding-left: 30px; border-left: 1px solid #eee; line-height: 1; color: #fff; font-size: 1.2rem;}
.h3 {
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  color: #f3f3f3;
  font-weight: normal;
  font-size: 24px;
  margin-top: 67px;
}
.links {
  color: #999;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  clear: both;
  padding-top: 20px;
  overflow: hidden;
}
.links ul{ display: flex; align-items: center; flex-wrap: wrap;}
.links ul li{width: 30%;
  display: block;
  height: 30px;
  line-height: 30px;
  overflow: hidden;}
.links ul li:hover a{color: #fff;}
.links ul li:hover a:before{background: #fff;}
.links ul li a{ padding-right: 5px; font-size: 1rem; position: relative;
  text-indent: 12px;
  display: inline-block;}
.links ul li a:before{ content: ""; position: absolute; left: 0; top: calc(50% - 3px); width: 6px; height: 6px; background: #888; transition: all .3s}
.f_div2_r2 {
  color: #999999;
  font-size: 15px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  float: right;
  line-height: 26px;
  width: 300px;
}
.h2 {
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  color: #f3f3f3;
  line-height: 36px;
  font-weight: normal;
  margin-bottom: 20px;
  font-size: 20px;
  text-align: left;
}
.f_link {
  color: #999999;
  font-size: 15px;
  line-height: 26px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  overflow: hidden;
  clear: both;
  text-align: left;
}
.bgs1 {
  color: #999999;
  font-size: 15px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  list-style: none;
  padding-left: 26px;
  line-height: 26px;
  margin-bottom: 12px;
  overflow: hidden;
  transition: all 0.3s;
  background-repeat: no-repeat;
  background-position: left 6px;
  background-image: url(../../../static/images/footer/foot_bg2.png);
}
.bgs2 {
  color: #999999;
  font-size: 15px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  list-style: none;
  padding-left: 26px;
  line-height: 26px;
  margin-bottom: 12px;
  overflow: hidden;
  transition: all 0.3s;
  background-repeat: no-repeat;
  background-position: left 6px;
  background-image: url(../../../static/images/footer/foot_bg3.png);
}
.bgs3 {
  color: #999999;
  font-size: 15px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  list-style: none;
  padding-left: 26px;
  line-height: 26px;
  margin-bottom: 12px;
  overflow: hidden;
  transition: all 0.3s;
  background-repeat: no-repeat;
  background-position: left 6px;
  background-image: url(../../../static/images/footer/foot_bg4.png);
}
.bgs4 {
  color: #999999;
  font-size: 15px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  list-style: none;
  padding-left: 26px;
  line-height: 26px;
  margin-bottom: 12px;
  overflow: hidden;
  transition: all 0.3s;
  background-repeat: no-repeat;
  background-position: left 6px;
  background-image: url(../../../static/images/footer/foot_bg5.png);
}
.c_l {
  color: #999999;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  clear: both;
  height: 0px;
  font-size: 0px;
  overflow: hidden;
}
.f_div3 {
  padding: 0;
  border: 0;
  box-sizing: border-box;
  margin: 0 auto;
  max-width: 1200px;
  line-height: 24px;
  min-height: 24px;
  clear: both;
  overflow: hidden;
  padding-top: 15px;
  padding-bottom: 15px;
  margin-top: 42px;
  color: #666;
  border-top: 1px solid #434343;
  font-size: 14px;
}
.f_bg_div {
  line-height: 24px;
  color: #666;
  font-size: 14px;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  width: 96%;
  max-width: 1200px;
  margin: 0 auto;
}
.l {
  line-height: 24px;
  color: #666;
  font-size: 14px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  float: left;
}
.r {
  line-height: 24px;
  color: #666;
  font-size: 14px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  float: right;
}
.f_bg a {
  line-height: 24px;
  margin: 0;
  padding: 0;
  border: 0;
  box-sizing: border-box;
  -webkit-tap-highlight-color: transparent;
  text-decoration: none;
  transition: all 0.3s;
  color: #999;
}
.f_bg .f_div2_r2 .f_link ul li {
  padding-left: 26px;
  line-height: 26px;
  margin-bottom: 12px;
  overflow: hidden;
  transition: all 0.3s;
  background-repeat: no-repeat;
  background-position: left 6px;
}
ul,
li {
  list-style: none;
}
</style>
