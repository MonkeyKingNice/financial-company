<template>
  <div>
    <article>
      <h2 class="aboutUs-h2"
          style="">关于我们</h2>
      <span class="aboutUs-span">
        ABOUT US
      </span>
    </article>

    <div class="txts">
      深圳佰税通企业登记代理有限公司创建于2019年，是一家专注于工商财税、一站式企业服务机构，服务涵盖公司注册、公司 变更、记账报税、银行开户、许可资质、网络服务、综合服务等，经过4年的沉淀与发展，建立了云财税服务体系，全网流程对接。
      <br><br>
      佰税通品牌：深圳佰税通企业登记代理有限公司。
      <br><br>
      进入2020年，迎来了宝安分公司的成立，完成了极具里程碑意义分部拓展，明确了未来3年的战略目标，每年一个台阶，通过持续和稳健的步伐，将赢态企业 提升到一个崭新的高度和全新的平台。
      <br><br>
      时间来到2019年，南山总部已经因为规模太小，董事会毅然将总部迁至宝安，形成一总一分格局，服务于客户，未来赢态将一步一个台阶，覆盖全深圳，拓 展至全国，将赢态企业打造成一个中小型企业孵化器，港湾式平台，为实现十九大而奋斗。
      <br><br>
      2020年新年新气象，佰税通企业本着服务客户的理念，继续为企业家服务，从公司成立至公司腾飞一路为您继续服务！
      <br><br>
      公司地址：深圳市宝安区西乡街道汇潮科技大厦2701-2703
    </div>
  </div>
</template>

<script>
export default {
  name: 'AboutUs',
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
.aboutUs-h2 {
  font-size: 42px;
  margin-bottom: 5px;
  font-family: "华文细黑";
  letter-spacing: 1px;
  font-weight: normal;
  color: #171717;
}
.aboutUs-span {
  color: #004098;
  font-size: 24px;
  text-transform: uppercase;
  font-family: Arial;
}
.txts {
  margin-top: 3%;
  margin-left: 10%;
  margin-right: 10%;
  font-size: 15px;
  overflow: hidden;
  line-height: 1.65;
  color: #666666;
  font-size: 16px;
  border: 0;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  display: block;
  text-align: left;
  font-family: "微软雅黑", "Arial", "Microsoft YaHei", "Helvetica Neue",
    "Helvetica", "Arial", "sans-serif";
}
</style>
