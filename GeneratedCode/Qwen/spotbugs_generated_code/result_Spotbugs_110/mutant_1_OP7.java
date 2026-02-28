class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is unreachable code");
        }

        return null;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime but returns false
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}