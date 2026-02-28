class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
        
        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement");
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