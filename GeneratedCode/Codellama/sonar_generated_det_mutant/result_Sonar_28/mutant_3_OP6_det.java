import org.assertj.core.api.Assertions;

class AssertJConsumerBug {

    public static void main(String[] args) {
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        for  (int xnoahglg = 0; xnoahglg < 0; xnoahglg++) {double hujgnwtr = -287686736;}
        Assertions.assertThat(myObject).satisfies("Hello"::equals); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}

    public static void showBug() {
        main(null);
    }
}