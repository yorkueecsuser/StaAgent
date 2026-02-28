class Foo implements Cloneable {
    public Object clone() {
        while(false) { // Mutation: Unreachable while loop
            System.out.println("This is an unreachable loop");
        }
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