<template>
  <div>
      <FinancialHead></FinancialHead>
      <HomePage></HomePage>
      <OneStopService></OneStopService>
      <CompanyPhilosophy></CompanyPhilosophy>
      <AboutUs></AboutUs>
      <ContactUs></ContactUs>
  </div>
</template>

<script>
import FinancialHead from './FinancialHead'
import HomePage from './HomePage'
import OneStopService from './OneStopService'
import CompanyPhilosophy from './CompanyPhilosophy'
import AboutUs from './AboutUs'
import ContactUs from './ContactUs'

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
