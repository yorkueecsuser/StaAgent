import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        boolean fbgledvu = false;while (fbgledvu && true && true && true && true && true && true && false && true && true && false && false) {short wovmtsqz = -1997;}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}