<template>
    <div>
      <navmenu></navmenu>
      <router-view/>
    </div>
</template>

<script>
import Navmenu from './common/Navmenu'
export default {
  name: 'Home',
  components: {Navmenu}
}
</script>

<style scoped>

</style>
