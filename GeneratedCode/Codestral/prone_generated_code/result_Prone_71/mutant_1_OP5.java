import java.util.TreeSet;

class MyClass {
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10);

        // Added unreachable switch statement
        int value = getFalseValue();
        switch(value) {
            case 1:
                System.out.println("This line should not be executed.");
                break;
        }

        return ts;
    }

    private int getFalseValue() {
        return -1;  // Always returns a value that will not match any case in the switch statement
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}