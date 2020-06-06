<template>
  <div>
    <article>
      <h2 class="service-h2"
          style="">我们的服务</h2>
      <span class="service-span">
        OUR SERVICES
      </span>
    </article>
    <TaxServicesComponent v-bind:jsonData="serviceJsonData"></TaxServicesComponent>
    <div>

    </div>
  </div>
</template>

<script>
import TaxServicesComponent from './TaxServicesComponent'
export default {
  name: 'OneStopService',
  data () {
    return {
      serviceJsonData: {}
    }
  },
  components: {
    TaxServicesComponent,
    props: ['jsonData']
  },
  created () {
    this.intitServiceJsonData()
  },

  computed: {

  },
  mounted () {
  },

  methods: {
    intitServiceJsonData () {
      var data
      this.$http.get('../../../../static/service_json/ServiceJsonData.json')
        .then(function (response) {
          data = response
        })
        .catch(function (error) {
          console.log(error)
        })
      this.serviceJsonData = data
      console.log(this.serviceJsonData)
    }
  }
}
</script>
<style>
.service-h2 {
  font-size: 42px;
  margin-bottom: 5px;
  font-family: "华文细黑";
  letter-spacing: 1px;
  font-weight: normal;
  color: #171717;
}
.service-span {
  color: #004098;
  font-size: 24px;
  text-transform: uppercase;
  font-family: Arial;
}
</style>
