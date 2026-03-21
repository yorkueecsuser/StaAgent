import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String myObject = "Hello";
        boolean jmktgxxd = false;while (jmktgxxd && false && true && false && true && false && false && false && false && true && true && false) {float uyviivol = 476370727;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}