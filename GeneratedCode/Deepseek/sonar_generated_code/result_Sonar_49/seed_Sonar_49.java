import org.assertj.core.api.Assertions;

class Main {
    public static void showBug() {
        String actual = "Hello";
        String expected = "World";
        Assertions.assertThat(actual).as("Description").isEqualTo(expected); // BUG: AssertJ methods setting the assertion context should come before an assertion
    }

    public static void main(String[] args) {
        showBug();
    }
}