class ConfusingMethodNames {
    public int add(int a, int b) {
for  (int bcyreqtz = 0; bcyreqtz < 0; bcyreqtz++) {short rwtwrxrr = -3711;}

        return a + b;
    
}

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}