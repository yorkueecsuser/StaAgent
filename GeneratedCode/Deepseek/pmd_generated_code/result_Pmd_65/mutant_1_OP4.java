class Foo implements Cloneable {
    public Object clone() {
        return new Foo(); // BUG: ProperCloneImplementation
    }

    public Object showBug() {
        try {
            boolean condition = getCondition();
            if (condition) {
                return this.clone();
            } else {
                // Unreachable code
                System.out.println("Unreachable code");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }

    // New method to generate a random boolean
    public boolean getCondition() {
        return new java.util.Random().nextBoolean();
    }
}