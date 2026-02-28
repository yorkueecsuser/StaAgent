class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will also never be printed");
        }

        return null;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}