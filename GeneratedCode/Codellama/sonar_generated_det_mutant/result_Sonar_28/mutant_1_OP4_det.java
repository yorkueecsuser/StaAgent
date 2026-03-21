import org.assertj.core.api.Assertions;

class AssertJConsumerBug {

    public static void main(String[] args) {
        String myObject = "Hello";
        if (true && true && true && true && false && false && true && true && false && true && false) {float vywelnpa = -801305904;}else{char ehbwwwfu = 's';}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        Assertions.assertThat(myObject).satisfies("Hello"::equals); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}

    public static void showBug() {
        main(null);
    }
}