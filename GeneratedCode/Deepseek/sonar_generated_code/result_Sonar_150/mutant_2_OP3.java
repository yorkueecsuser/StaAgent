import java.util.Objects;

class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj;
        return value == that.value;
    }

    public int showBug() {
        Object other = new String();
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other);
        boolean condition = false;
        if (condition) {
            System.out.println("This is unreachable branch");
        }
        return thisClass.value;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}