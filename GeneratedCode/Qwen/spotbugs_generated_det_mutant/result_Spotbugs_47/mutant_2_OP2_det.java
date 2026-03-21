import java.lang.ThreadLocal;

class DeadlyEmbraceExample {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
        public String getData() {
            return "Data from InnerClass";
        }
    }
public void showBug() {
    InnerClass innerInstance = new InnerClass();
    innerInstance = new InnerClass();
    threadLocal.set(innerInstance);
    System.out.println("InnerClass data: " + threadLocal.get().getData());
}

    public static void main(String[] args) {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug();
    }
}