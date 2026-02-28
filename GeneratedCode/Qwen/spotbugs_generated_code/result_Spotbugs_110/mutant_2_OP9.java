class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)

        // Introduced loop for mutation
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Equivalent Loop Replacement: Replacing the while loop with a do-while loop
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return null;
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}