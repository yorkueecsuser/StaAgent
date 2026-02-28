class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 

        // Introduced a loop for mutation purposes
        int i = 0;
        while (i < 0) { // This loop will not execute because the condition is false
            i++;
        }

        // Equivalent do-while loop replacement
        do {
            i++;
        } while (i < 0); // This loop will also not execute because the condition is false

        return null;
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}