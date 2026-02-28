import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o);
      
        boolean whileCondition = false;
        while(whileCondition) {
            System.out.println("This is a unreachable while loop.");
            whileCondition = false;
        }
      
        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}