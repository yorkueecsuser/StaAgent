class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        int result = 0;
        int i = 0;

        do {
            if (i % 2 == 0) {
                result = add(a, b);
            } else {
                result = Add(a, b);
            }
            i++;
        } while (i < 5);

        return result;
    }
}