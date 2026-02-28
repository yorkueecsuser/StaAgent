import java.lang.ThreadLocal;

class DeadlyEmbraceExample {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
        public String getData() {
            return "Data from InnerClass";
        }
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop is unreachable because getCondition() returns false
        }

        InnerClass innerInstance = new InnerClass(); // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE) 
        threadLocal.set(innerInstance);
        System.out.println("InnerClass data: " + threadLocal.get().getData());
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();
    }
}