import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        if (true && true && false && true && false && true && false && true && true && false && false) {boolean kgeqadxf = true;}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}