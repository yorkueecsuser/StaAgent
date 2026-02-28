class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int x = flag? foo : null; // BUG: NullTernary

        // Mutant: Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            x = 42;
        }

        return x;
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
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