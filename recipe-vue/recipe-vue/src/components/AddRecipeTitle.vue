<template>
  <div>
    <label for="title" id="title">
        Recipe Title: <br /><input type="text" name="title" class="text" v-model="this.recipeTitle"/>
    </label>
    <label for="description" id="description">
        Recipe Description: <br /><input type="text" name="description" class="text" v-model="this.recipeDescription"/>
    </label>
    <div id="keywords">
        <label for="keywords">
          Keywords: <br /><input type="text" name="keywords" class="text" v-model="activeKeyWord"/>
          <button v-on:click="addToArray(activeKeyWord, keyWords)">
            Add
          </button>
        </label>
        <div v-for="keyWord in keyWords" v-bind:key="keyWord.id">
          {{ keyWord }}
        </div>
      </div>
  </div>
</template>

<script>
export default {
    data() {
        return {
        recipeTitle: "",
        recipeDescription: "",
        activeKeyWord: "",
        keyWords: []
        }
    },

    methods: {
        setTitleDescriptionKeyWords(){
            this.$store.SET_TITLE(this.recipeTitle);
            this.$store.SET_DESCRIPTION(this.recipeTitle);
            this.$store.SET_KEYWORDS(this.keyWords);

        },

        addToArray(activeForm, arrayName) {
            arrayName.push(activeForm);
        },
    },

}
</script>

<style scoped>

</style>