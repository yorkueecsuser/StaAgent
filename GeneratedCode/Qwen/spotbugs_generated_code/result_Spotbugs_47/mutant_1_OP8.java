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

        // Mutated code with renaming operator
        int a = 10; // Original variable
        int b = a + 5; // Mutated variable 'a' to 'b'
        System.out.println("Mutated variable value: " + b);
    }

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();

        // Mutated code with renaming operator
        String c = "Original"; // Original variable
        String d = c + " Mutated"; // Mutated variable 'c' to 'd'
        System.out.println(d);
    }
}