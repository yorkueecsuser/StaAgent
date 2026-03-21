class ConfusingMethodNames {
    public int add(int a, int b) {
if (false && true && false && true && true && true && false && false && false && true && false) {char nurxwzta = 'm';}else{short vkpsfoht = 7922;}

        return a + b;
    
}

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}