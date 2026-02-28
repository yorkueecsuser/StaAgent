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
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other); // This will throw ClassCastException
        return this.value; // The variable "thisClass" is renamed to "this" to avoid ClassCastException
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}