<template>
    <div>
      用户名：<input type="text" v-model="loginForm.name" placeholder="请输入用户名">
      <br>
      <br>
      密码：<input type="password" v-model="loginForm.passwd" placeholder="请输入密码">
      <br>
      <br>
      <button v-on:click="login">登录</button>
    </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      loginForm: {
        name: '',
        passwd: ''
      },
      responseResult: []
    }
  },
  methods: {
    login () {
      this.$axios
        .post('/login', {
          name: this.loginForm.name,
          passwd: this.loginForm.passwd
        })
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            this.$router.replace({path: '/index'})
          }
        })
        .catch(failResponse => {
        })
    }
  }
}
</script>

<style scoped>

</style>
