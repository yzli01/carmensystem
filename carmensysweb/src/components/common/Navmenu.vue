<template>
  <el-menu
    :default-active="'/index'"
    router
    mode="horizontal"
    background-color="white"
    text-color="#222"
    active-text-color="red">
    <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name">
      {{item.navItem}}
    </el-menu-item>
    <span style="position: absolute;padding-top: 20px;right: 43%;font-size: 20px;font-weight: bold">CarmenSystem</span>
  </el-menu>
</template>

<script>
export default {
  name: 'Navmenu',
  data () {
    return {
      navList: [
        {name: '/index', navItem: '首页'},
        {name: '/willing', navItem: '愿望列表'},
        {name: '/person', navItem: '个人中心'}
      ]
    }
  }
}
</script>

<style scoped>
  span {
    pointer-events: none;
  }
</style>
