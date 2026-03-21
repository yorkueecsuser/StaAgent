import org.assertj.core.api.Assertions;

class AssertJConsumerBug {

    public static void main(String[] args) {
        String myObject = "Hello";
        if (true && true && true && false && true && true && true && false && true && false && false) {int wzazbcdz = 967049248;}else{long xxezwftj = 666500211;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        Assertions.assertThat(myObject).satisfies("Hello"::equals); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}

    public static void showBug() {
        main(null);
    }
}