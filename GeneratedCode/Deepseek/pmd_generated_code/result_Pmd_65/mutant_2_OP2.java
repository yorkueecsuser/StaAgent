class Foo implements Cloneable {
    public Object clone() {
        return new Foo(); // Mutant 1
        return new Foo(); // Mutant 2
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