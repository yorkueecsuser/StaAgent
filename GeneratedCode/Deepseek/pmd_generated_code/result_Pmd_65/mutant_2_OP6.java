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
    }
}

// Add a unreachable loop after main
boolean alwaysFalse = false;
for (int i = 0; alwaysFalse; i++) {
    System.out.println("This is an unreachable loop");
}