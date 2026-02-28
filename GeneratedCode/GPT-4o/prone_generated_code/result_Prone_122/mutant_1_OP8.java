class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        return unboxedResult;
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}

// Mutant Code with Renaming
class NullTernaryExampleMutant1 {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer r = flag ? foo : null; // Renamed variable 'result' to 'r'
        int unboxedR = r; // Renamed variable 'unboxedResult' to 'unboxedR'
        return unboxedR;
    }

    public static void main(String[] args) {
        NullTernaryExampleMutant1 example = new NullTernaryExampleMutant1();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}