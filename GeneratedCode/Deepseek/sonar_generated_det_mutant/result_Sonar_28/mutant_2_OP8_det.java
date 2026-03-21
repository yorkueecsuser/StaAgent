import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String kjebbdye = "Hello";
        Assertions.assertThat(kjebbdye).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(kjebbdye).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}