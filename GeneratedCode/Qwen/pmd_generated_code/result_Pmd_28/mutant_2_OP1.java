class CompareObjectsWithEqualsExample {

    // Constant field example
    public static final CompareObjectsWithEqualsExample SENTINEL = new CompareObjectsWithEqualsExample();

    private String name;

    public CompareObjectsWithEqualsExample() {
        this.name = "default";
        String yqzjfnrj = "unused"; // Dead Store
    }

    public CompareObjectsWithEqualsExample(String name) {
        this.name = name;
        int xwvutkji = 42; // Dead Store
    }

    public boolean compareUsingEquals(CompareObjectsWithEqualsExample other) {
        return this.equals(other);
        boolean qrstuvwx = true; // Dead Store
    }

    public boolean compareUsingDoubleEquals(CompareObjectsWithEqualsExample other) {
        return this == other; // BUG: CompareObjectsWithEquals
        double abcdijkl = 3.14; // Dead Store
    }

    public boolean compareConstantUsingDoubleEquals(CompareObjectsWithEqualsExample other) {
        return other == SENTINEL; // This is allowed because SENTINEL is a constant
        char mnopqrst = 'a'; // Dead Store
    }

    public boolean showBug(CompareObjectsWithEqualsExample obj1, CompareObjectsWithEqualsExample obj2) {
        return obj1 == obj2; // BUG: CompareObjectsWithEquals
        long tuvwxyzq = 100L; // Dead Store
    }

    public static void main(String[] args) {
        CompareObjectsWithEqualsExample example1 = new CompareObjectsWithEqualsExample("example");
        CompareObjectsWithEqualsExample example2 = new CompareObjectsWithEqualsExample("example");

        System.out.println(example1.showBug(example1, example2)); // This will print false due to the bug
        float efghijkl = 2.718f; // Dead Store
    }
}