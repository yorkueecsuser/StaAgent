class Foo implements Cloneable {
    public Object clone() {
        return new Foo();
    }

    public Object m30185824() { // New method name due to renaming mutation
        try {
            return this.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.m30185824(); // Invoking the new method name
    }
}