// BUG: "equals" method overrides should accept "Object" parameters

import java.util.Objects;

class EqualsBug {
    private int x;
    private int y;

    public EqualsBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
    }

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }
}

/* Mutation Operator: Duplication
 * Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
 * Core Requirements:
 * 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
 * 2. Generated mutated Java code MUST compile successfully.
 * 3. Mutant code being added MUST be unique not generic.
 * 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
 * 5. Generated mutated Java code MUST avoid unreachable statement error.
 */

// Mutant 1: Duplicate assignment statement
class EqualsBugMutant1 {
    private int x;
    private int y;

    public EqualsBugMutant1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
    }

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }
}

// Mutant 2: Duplicate assignment statement
class EqualsBugMutant2 {
    private int x;
    private int y;

    public EqualsBugMutant2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
    }

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }
}