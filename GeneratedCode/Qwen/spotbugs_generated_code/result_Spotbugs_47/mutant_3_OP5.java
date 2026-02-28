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

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("This is another unreachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();
    }
}