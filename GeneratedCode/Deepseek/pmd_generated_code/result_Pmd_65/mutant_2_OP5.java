class Foo implements Cloneable {
    private boolean condition = false; // MUTANT: Unreachable Switch Statement

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
    }
}