class AlwaysThrows {

    public int showBug() {
        int numerator = 10;
        int e = 0;  // Mutated variable name
        return numerator / e;
    }

}