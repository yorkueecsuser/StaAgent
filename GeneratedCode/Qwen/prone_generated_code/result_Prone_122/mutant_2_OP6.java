class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int x = flag? foo : null; // BUG: NullTernary

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will return false
        }

        return x;
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime and will return false
        return false;
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println(example.showBug(false, 10));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}