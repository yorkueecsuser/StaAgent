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
        if (false) { // Unreachable if statement mutation operator
            System.out.println("This branch will never be reached");
        }
    }
}