import java.lang.ThreadLocal;

class DeadlyEmbraceExample {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
        public String getData() {
            return "Data from InnerClass";
        }
    }

    public void showBug() {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable if statement.");
        }

        InnerClass innerInstance = new InnerClass(); // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE) 
        threadLocal.set(innerInstance);
        System.out.println("InnerClass data: " + threadLocal.get().getData());
    }

    private boolean getCondition() {
        return false; // Always returns false, but the condition check is dynamic
    }

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();
    }
}