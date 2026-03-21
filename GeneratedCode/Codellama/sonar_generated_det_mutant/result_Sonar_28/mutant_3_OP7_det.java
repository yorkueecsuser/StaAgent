import org.assertj.core.api.Assertions;

class AssertJConsumerBug {

    public static void main(String[] args) {
        String myObject = "Hello";
        boolean zdbrvjzz = false;while (zdbrvjzz && false && false && false && false && true && false && false && true && false && true && false) {float kotgilhe = 899035113;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        Assertions.assertThat(myObject).satisfies("Hello"::equals); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}

    public static void showBug() {
        main(null);
    }
}