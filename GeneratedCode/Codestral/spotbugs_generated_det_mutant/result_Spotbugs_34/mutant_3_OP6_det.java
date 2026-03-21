class ConfusingMethodNames {
    public int add(int a, int b) {
for  (int mcgalkuc = 0; mcgalkuc < 0; mcgalkuc++) {byte pxxibsgs = 66;}

        return a + b;
    
}

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}