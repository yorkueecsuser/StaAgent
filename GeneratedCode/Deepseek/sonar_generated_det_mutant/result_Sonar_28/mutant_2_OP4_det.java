import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String myObject = "Hello";
        if (true && true && false && false && false && false && false && false && true && false && false) {byte irzpvsjr = -89;}else{int bdjyyjdk = -434254218;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}