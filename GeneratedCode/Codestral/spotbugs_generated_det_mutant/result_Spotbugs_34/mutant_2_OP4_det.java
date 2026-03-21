class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { if (true && true && true && true && false && true && false && true && false && false && false) {String aulktliw = "jmycrdju";}else{String buapaesr = "moorltxk";}
 // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    
}

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}