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
        boolean conditionFor = getCondition(); // Added unreachable if-else statement
        for (int i = 0; conditionFor; i++) { 
            // Unreachable code
        }
    }

    // Added helper methods
    public static boolean getCondition() {
        return false;
    }
}