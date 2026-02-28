class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
        
        // Mutant code: Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
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