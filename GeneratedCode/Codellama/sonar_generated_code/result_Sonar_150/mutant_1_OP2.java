class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: "equals(Object obj)" should test the argument's type
        MyClass that = (MyClass) obj; // may throw a ClassCastException
        return this.id == that.id && this.name.equals(that.name);
    }

    public static void showBug(Object obj) {
        MyClass myClass = new MyClass(1, "John");
        System.out.println(myClass.equals(obj));
    }
}

// Mutation Operator: Duplication
// Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
// Core Requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutated Java code:
class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: "equals(Object obj)" should test the argument's type
        MyClass that = (MyClass) obj; // may throw a ClassCastException
        return this.id == that.id && this.name.equals(that.name);
    }

    public static void showBug(Object obj) {
        MyClass myClass = new MyClass(1, "John");
        System.out.println(myClass.equals(obj));

        // Mutation Operator: Duplication
        // Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.

        // Mutated Java code:
        MyClass myClass2 = new MyClass(1, "John");
        System.out.println(myClass.equals(obj));
    }
}