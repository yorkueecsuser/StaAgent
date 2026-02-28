import java.util.Objects;

class MyClass {

    private int value;
    private String deadStore1234; // Dead store mutation

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return value == that.value;
    }

    public int showBug() {
        String deadStore5678; // Dead store mutation
        Object other = new String();
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other); // This will throw ClassCastException
        return thisClass.value; // This line will never execute normally
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}