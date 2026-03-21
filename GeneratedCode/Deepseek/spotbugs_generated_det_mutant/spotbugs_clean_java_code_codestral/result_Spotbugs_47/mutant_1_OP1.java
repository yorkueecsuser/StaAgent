import java.util.Random;

class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();

        // Inserted dead store
        Random rand = new Random();
        int deadStoreVariable = rand.nextInt(100); // Unused variable

        setInnerClass(innerClass);
    }
}