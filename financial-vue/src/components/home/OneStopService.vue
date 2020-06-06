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
      serviceJsonData: { name: 'zl' }
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
      this.$http.get('../../../../static/service_json/ServiceJsonData.json')
        .then((response) => {
          this.serviceJsonData = response.data
          console.log(this.serviceJsonData)
        })
        .catch((error) => {
          console.log(error)
        })
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
