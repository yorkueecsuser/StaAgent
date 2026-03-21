import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String myObject = "Hello";
        for  (int jpshiuwq = 0; jpshiuwq < 0; jpshiuwq++) {byte mtbcnwnl = 32;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}