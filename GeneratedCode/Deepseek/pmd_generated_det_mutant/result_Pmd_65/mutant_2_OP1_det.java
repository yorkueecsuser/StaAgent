class Foo implements Cloneable {
    public Object clone() {
double odctqkwx = 906003312;

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