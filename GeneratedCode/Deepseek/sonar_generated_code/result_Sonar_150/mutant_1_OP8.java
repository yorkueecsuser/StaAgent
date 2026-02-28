import java.util.Objects;

class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return value == that.value;
    }

    public int showBug() {
        Object other = new String();
        MyClass renamedClass = new MyClass(10);
        renamedClass.equals(other); // This will throw ClassCastException
        return renamedClass.value; // This line will never execute normally
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}