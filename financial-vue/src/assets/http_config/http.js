/**
 * ajax请求配置
 */
import axios from 'axios'
// import apiURL from './host.js'

// axios默认配置
axios.defaults.timeout = 10000 // 超时时间
// axios.defaults.baseURL = apiURL // 默认地址

// 整理数据
axios.defaults.transformRequest = function (data) {
  // data = Qs.stringify(data)
  data = JSON.stringify(data)
  return data
}

// 路由响应拦截
// http response 拦截器
axios.interceptors.response.use(
  response => {
    if (response.data.resultCode === '404') {
      console.log('response.data.resultCode是404')
      // 返回 错误代码-1 清除ticket信息并跳转到登录页面
      //      cookie.del("ticket")
      //      window.location.href='http://login.com'
    } else {
      return response
    }
  },
  error => {
    return Promise.reject(error.response) // 返回接口返回的错误信息
  })

export default axios
