<template>
  <div>
      欢迎来到众所周知！
  </div>
</template>

<script>
import FinancialHead from '@/components/FinancialHead'
import HomePage from '@/components/HomePage'
import OneStopService from '@/components/OneStopService'
import CompanyPhilosophy from '@/components/CompanyPhilosophy'
import AboutUs from '@/components/AboutUs'
import ContactUs from '@/components/ContactUs'

export default {
  name: 'Home',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  components: {
      FinancialHead,
      HomePage,
      OneStopService,
      CompanyPhilosophy,
      AboutUs,
      ContactUs
  },
  created () {

  },

  computed: {},

  methods: {}
}
</script>
