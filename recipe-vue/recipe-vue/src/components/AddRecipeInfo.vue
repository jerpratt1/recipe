<template>
  <div id="main">
    <label for="prep" id="prep">
        Prep Time: <br /><input type="number" name="prep" v-model="this.prepTime"/><br />
    </label>
    <label for="cook" id="cook">
        Cook Time: <br /><input type="number" name="cook" v-model="this.cookTime"/><br />
    </label>
    <label for="rest" id="rest">
        Rest Time: <br /><input type="number" name="rest" v-model="this.restTime"/><br />
    </label>
    <label for="serving" id="serving">
        Serving Size: <br /><input type="number" name="serving" v-model="this.servingSize"/><br />
    </label>
  </div>
</template>

<script>
export default {
    data() {
        return {
        prepTime: 0,
        cookTime: 0,
        restTime: 0,
        servingSize: 0,
        tools: [],
        ingredients: [],
        instructions: [],
        notes: [],
        }
    },

    methods: {
        setNumbers(){
            this.$store.SET_PREP(this.prepTime);
            this.$store.SET_COOK(this.cookTime);
            this.$store.SET_REST(this.restTime);
            this.$store.SET_SERVING(this.servingSize);
        },

        addToArray(activeForm, arrayName) {
            arrayName.push(activeForm);
        },
    },
}
</script>

<style scoped>

#main{
    display: flex;
    align-content: center;
    justify-content: space-around;
}

</style>