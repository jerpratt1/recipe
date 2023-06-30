<template>
  <div>
    <add-recipe-title />
    <add-recipe-info />
    <add-recipe />
  </div>
</template>

<script>
import AddRecipeTitle from '@/components/AddRecipeTitle.vue'
import AddRecipeInfo from '@/components/AddRecipeInfo.vue'
import AddRecipe from '@/components/AddRecipe.vue'
export default {
    components: { AddRecipeTitle, AddRecipeInfo, AddRecipe},

}
</script>

<style>

</style>