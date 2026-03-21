import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        if (false && true && false && false && true && false && false && true && true && true && false) {String jsojkegb = "ejgteinc";}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}