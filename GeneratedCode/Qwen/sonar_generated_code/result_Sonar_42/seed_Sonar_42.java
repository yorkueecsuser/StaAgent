import java.util.Objects;

class ExampleClass {

    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        ExampleClass that = (ExampleClass) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void showBug() {
        ExampleClass obj = new ExampleClass(10);
        assert obj.equals(obj); // BUG: Assertions should not compare an object to itself
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass(5);
        example.showBug();
    }
}