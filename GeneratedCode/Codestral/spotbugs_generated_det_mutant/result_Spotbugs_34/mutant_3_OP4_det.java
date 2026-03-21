class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { if (false && true && true && false && true && true && false && true && true && false && false) {float ojtjccxh = 637802830;}else{long udyxyshs = 730008541;}
 // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    
}

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}