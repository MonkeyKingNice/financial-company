<template>
  <div>
    <a href="javascript:void(0)"
       title="">
      <div class="imgs"><img :src="jsonData.serviceImgPath"
             alt="" />
        <div class="txts">
          <h3 class="f24 h3">{{jsonData.serviceName}}</h3>
        </div>
      </div>
    </a>
    <div class="dl">
      <dl>
        <dd v-for="(item) in jsonData.sonService"
            :key="item.sonServiceName">
          <a :href="item.sonServiceLinkPath"
             target="_blank"
             :title="item.sonServiceName">
            <p>{{item.sonServiceName}}</p>
          </a>
          <!-- <a v-if="(index + 1) < jsonData.sonService.length"
             :href="jsonData.sonService[index + 1].sonServiceLinkPath"
             target="_blank"
             :title="jsonData.sonService[index+1].sonServiceName">
            <p>{{jsonData.sonService[index+1].sonServiceName}}</p>
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
      sonServiceCount: this.jsonData.sonService
    }
  },
  props: {
    jsonData: Object
  },
  components: {

  },
  created () {
    // console.log(this.sonServiceCount)
  },

  computed: {

  },

  methods: {
    initSonServiceCount () {
      this.sonServiceCount = this.jsonData.sonService.length
    }
  }
}
</script>
<style>
</style>
