class ConfusingMethodNames {
    public int add(int a, int b) {
        int result = 0;
        int i = a;
        do { // Mutant code: Replaced for loop with equivalent do-while loop
            result += i;
            i++;
        } while(i <= b);
        return result;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}