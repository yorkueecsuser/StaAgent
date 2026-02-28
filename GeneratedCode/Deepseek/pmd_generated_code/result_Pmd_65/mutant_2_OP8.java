class Foo implements Cloneable {
    public Object clonable() { // Mutated code, renaming the method
        return new Foo(); // BUG: ProperCloneImplementation
    }

    public Object showBug() {
        try {
            return this.clonable(); // Calls the mutated method
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object showsBug() { // Mutated code, renaming the method
        try {
            return this.showBug(); // Calls the mutated method
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug(); // Calls the original method
        foo.showsBug(); // Calls the mutated method
    }
}