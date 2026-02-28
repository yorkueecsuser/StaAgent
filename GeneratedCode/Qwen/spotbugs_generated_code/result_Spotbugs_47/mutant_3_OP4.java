import java.lang.ThreadLocal;

class DeadlyEmbraceExample {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
        public String getData() {
            return "Data from InnerClass";
        }
    }

    public void showBug() {
        InnerClass innerInstance = new InnerClass(); // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE) 
        threadLocal.set(innerInstance);
        System.out.println("InnerClass data: " + threadLocal.get().getData());

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This should never be printed.");
        } else {
            System.out.println("This is also never reachable.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();
    }
}