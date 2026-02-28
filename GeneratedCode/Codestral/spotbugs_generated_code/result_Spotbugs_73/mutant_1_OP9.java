class BuggyCode {
    //... (rest of the original code)

    public static boolean showBug() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        // Added equivalent do-while loop
        do {
            // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
            return objA.equals(objB); // Comparing objects of different classes
        } while (false); // This loop will run once and then exit
    }

    //... (rest of the original code)
}