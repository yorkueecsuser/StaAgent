class Foo implements Cloneable {
    public Object clone() {
        return new Foo(); // BUG: ProperCloneImplementation
    }

    public Object showBug() {
        try {
            return this.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();

        // Added Mutation
        boolean condition = getCondition();
        switch (0) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    // Added method to ensure the condition is determined at runtime
    public static boolean getCondition() {
        return false;
    }
}