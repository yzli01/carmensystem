import Vue from 'vue'
import Router from 'vue-router'

// 导入编写的组件
import AppIndex from '../components/home/AppIndex'
import Login from '../components/Login'
import Home from '../components/Home'
import Willing from '../components/willing/Willing'
import Person from '../components/person/Person'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/home',
      name: 'Home',
      component: Home,
      redirect: '/index',
      children: [
        {
          path: '/index',
          name: 'AppIndex',
          component: AppIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/willing',
          name: 'Willing',
          component: Willing,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/person',
          name: 'Person',
          component: Person,
          meta: {
            requireAuth: true
          }
        }
      ]
    }
  ]
})
