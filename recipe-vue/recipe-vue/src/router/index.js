import Vue from 'vue'
import VueRouter from 'vue-router'
import AddRecipeView from '../views/AddRecipeView.vue'
import RecipeCardView from '../views/RecipeCardView.vue'
import RecipeBoxView from '../views/RecipeBoxView.vue'

Vue.use(VueRouter)

const routes = [
 {
    path: '/add',
    name: 'add',
    component: AddRecipeView
  },
  {
    path: '/',
    name: 'card',
    component: RecipeCardView
  },
  {
    path: '/box',
    name: 'box',
    component: RecipeBoxView
  },

 
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
