class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 

        // Mutant: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed because condition is always false.");
        } else {
            System.out.println("This will also never be printed because condition is always false.");
        }

        return null;
    }

    private boolean getCondition() {
        return false;
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}