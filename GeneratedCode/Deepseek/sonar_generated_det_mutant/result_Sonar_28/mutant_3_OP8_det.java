import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String gavzreli = "Hello";
        Assertions.assertThat(gavzreli).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(gavzreli).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}