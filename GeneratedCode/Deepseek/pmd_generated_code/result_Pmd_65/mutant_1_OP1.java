class Foo implements Cloneable {
    public Object clone() {
        return new Foo(); // BUG: ProperCloneImplementation
    }

    public Object showBug() {
        try {
            String deadStore = "abcdefgh"; // Mutation: Dead Store
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