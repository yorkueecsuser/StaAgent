import java.lang.ThreadLocal;

class DeadlyEmbraceExample {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
        public String getData() {
            return "Data from InnerClass";
        }
    }

    public void showBug() {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some code that might run
            System.out.println("This is a reachable if block.");
        } else {
            // Unreachable else block due to the condition always being true
            System.out.println("This is an unreachable else block.");
        }

        InnerClass innerInstance = new InnerClass(); // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE) 
        threadLocal.set(innerInstance);
        System.out.println("InnerClass data: " + threadLocal.get().getData());
    }

    private boolean getCondition() {
        // This method always returns true, making the else block unreachable
        return true;
    }

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();
    }
}