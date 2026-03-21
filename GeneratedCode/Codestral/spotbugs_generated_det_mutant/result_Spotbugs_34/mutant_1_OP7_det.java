class ConfusingMethodNames {
    public int add(int a, int b) {
boolean kytutfuc = false;while (kytutfuc && true && true && true && true && false && true && false && false && false && true && false) {boolean bhlnbjej = false;}

        return a + b;
    
}

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}