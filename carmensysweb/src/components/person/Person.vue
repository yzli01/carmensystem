<template>
  <el-container>
    <el-header></el-header>
    <el-main>
      <el-calendar v-model="value">
      </el-calendar>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: 'Person',
  data () {
    return {
      value: new Date()
    }
  }
}
</script>

<style scoped>

</style>
