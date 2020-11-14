<template>
  <div class="block">
    <el-timeline>
      <el-timeline-item v-for="(item,i) in timeList" :key="i" :timestamp="item.time" placement="top">
        <el-card>
          <h4>{{item.timeItem}}</h4>
          <p>{{item.timeDone}}</p>
        </el-card>
      </el-timeline-item>
    </el-timeline>
  </div>
</template>

<script>
export default {
  name: 'AppIndex',
  data () {
    return {
      timeList: [
        {time: '2020/8/1', timeItem: '买包包', timeDone: 'Carmen 提交于 2020/1/1 20:46'},
        {time: '2020/4/3', timeItem: '愿望列表', timeDone: 'Carmen 提交于 2020/4/3 20:46'},
        {time: '2020/4/2', timeItem: '亲亲', timeDone: 'Carmen 提交于 2018/4/2 20:46'}
      ]
    }
  }
}
</script>

<style scoped>
</style>
