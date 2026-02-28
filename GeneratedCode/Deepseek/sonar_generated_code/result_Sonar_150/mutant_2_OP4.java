import java.util.Objects;

class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        MyClass that = (MyClass) obj;
        return value == that.value;
    }

    public int showBug() {
        Object other = new String();
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other);
        int unreachableValue = 10;
        boolean shouldRun = true;
        if (shouldRun) {
            unreachableValue = 20;
        } else {
            unreachableValue = 30;
        }
        return thisClass.value;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}