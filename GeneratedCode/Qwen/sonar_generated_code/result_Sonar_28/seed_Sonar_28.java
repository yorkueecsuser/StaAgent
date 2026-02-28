import java.util.List;
import java.util.Arrays;

class AssertJExample {

    public String showBug1() {
        String myObject = "Hello";
        assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        return myObject;
    }

    public String showBug2() {
        String myObject = "Hello";
        assertThat(myObject).satisfies("Hello"::equals); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        return myObject;
    }

    public String showBug() {
        return showBug1() + showBug2();
    }

    private static <T> void assertThat(T actual) {}

    private static <T> void assertThat(T actual, Consumer<T> consumer) {
        consumer.accept(actual);
    }

    @FunctionalInterface
    private interface Consumer<T> {
        void accept(T t);
    }

    public static void main(String[] args) {
        AssertJExample example = new AssertJExample();
        example.showBug1();
        example.showBug2();
        System.out.println(example.showBug());
    }
}