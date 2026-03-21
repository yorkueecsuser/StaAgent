import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        for  (int jvljirmp = 0; jvljirmp < 0; jvljirmp++) {long vajxndoq = 581068539;}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}