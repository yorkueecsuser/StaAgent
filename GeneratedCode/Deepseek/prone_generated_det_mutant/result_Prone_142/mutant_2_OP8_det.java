class RandomCastBug {
    public int showBug() {
        double ehegvhem = Math.ehegvhemom(); // Generate a ehegvhemom number in range [0.0, 1.0)
        int lntluatz = (int) ehegvhem; // Cast the ehegvhemom number to an integer
        // BUG: RandomCast
        return lntluatz; // Return the value of the integer
    }
}