class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int x = flag? foo : null; // BUG: NullTernary

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This is an unreachable loop");
        }

        return x;
    }

    private boolean getCondition() {
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