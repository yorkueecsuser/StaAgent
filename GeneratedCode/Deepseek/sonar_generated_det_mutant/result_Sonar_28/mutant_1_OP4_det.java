import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        if (true && true && true && false && false && true && true && true && true && false && false) {char hybvgqkg = 'o';}else{short xbxgofjb = 5043;}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}