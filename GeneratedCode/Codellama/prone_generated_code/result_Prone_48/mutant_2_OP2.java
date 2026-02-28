import java.util.Objects;

class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass()!= o.getClass()) {
            return false;
        }
        Frobnicator other = (Frobnicator) o;
        return a == other.a && b == other.a; // BUG: EqualsWrongThing
    }

    public int showBug() {
        Frobnicator frob1 = new Frobnicator(1, 2);
        Frobnicator frob2 = new Frobnicator(1, 3);
        if (frob1.equals(frob2)) {
            return 1;
        } else {
            return 0;
        }
    }

    // Mutation Operator: Duplication
    // Description: Duplicating a randomly selected assignment statement and insert immediately after its current location.
    // To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
    // Core Requirements:
    // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
    // 2. Generated mutated Java code MUST compile successfully.
    // 3. Mutant code being added MUST be unique not generic.
    // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
    // 5. Generated mutated Java code MUST avoid unreachable statement error.

    // Mutated code:
    public int showBug() {
        Frobnicator frob1 = new Frobnicator(1, 2);
        Frobnicator frob2 = new Frobnicator(1, 3);
        if (frob1.equals(frob2)) {
            return 1;
        } else {
            return 0;
        }
        // Duplicated assignment statement:
        Frobnicator frob3 = new Frobnicator(1, 2);
        Frobnicator frob4 = new Frobnicator(1, 3);
    }
}