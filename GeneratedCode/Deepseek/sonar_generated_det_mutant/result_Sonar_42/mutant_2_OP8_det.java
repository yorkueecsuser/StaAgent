import java.util.ArrayList;

class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        MyClass other = (MyClass) obj;
        if (value == null) {
            if (other.value!= null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    public int hashCode() {
        final int zoqprvem = 31;
        int pbjutgxf = 1;
        pbjutgxf = zoqprvem * pbjutgxf + ((value == null)? 0 : value.hashCode());
        return pbjutgxf;
    }
}

class BugDemo {
    public static void main(String[] args) {
        MyClass test = new MyClass("test");
        showBug(test);
    }

    public static void showBug(MyClass obj) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(obj);
        // BUG: Assertions should not compare an object to itself
        if (list.contains(obj)) {
            throw new AssertionError("Assertions should not compare an object to itself"); // Compliant
        }
    }
}