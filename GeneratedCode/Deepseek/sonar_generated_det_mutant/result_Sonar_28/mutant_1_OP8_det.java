import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String fxqojotu = "Hello";
        Assertions.assertThat(fxqojotu).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(fxqojotu).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}