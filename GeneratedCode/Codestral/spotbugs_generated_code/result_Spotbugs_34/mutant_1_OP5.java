class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        boolean shouldSwitch = false;
        int x = a - b;

        if (shouldSwitch) {
            switch (x) { // Unreachable switch statement
                case 1:
                    x = x + 1;
                    break;
                default:
                    x = x - 1;
            }
        }

        return x;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}