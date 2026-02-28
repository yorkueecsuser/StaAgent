class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 

        // Added a unique loop that does not affect the existing functionality
        int count = 0;
        while (count < 1) {
            count++;
        }

        // Applying Equivalent Loop Replacement mutation operator
        do {
            count--;
        } while (count > 0);

        return Boolean.toString(result);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}