class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 

        // Introduced loop for mutation
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return Boolean.toString(result);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}