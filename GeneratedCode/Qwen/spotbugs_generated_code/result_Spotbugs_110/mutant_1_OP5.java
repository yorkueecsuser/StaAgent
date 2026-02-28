class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable");
                break;
            case 1:
                // This is the reachable case
                break;
        }

        return null;
    }

    private boolean getCondition() {
        return false; // This ensures the switch condition is always false, making the first case unreachable
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}