import org.assertj.core.api.Assertions;

class AssertJConsumerBug {

    public static void main(String[] args) {
        String myObject = "Hello";
        int vkogeuqb = 0;switch  (vkogeuqb) {case 1:short pdhgppaw = 7540;break;default:int mtcpluga = 592246638;break;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        Assertions.assertThat(myObject).satisfies("Hello"::equals); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}

    public static void showBug() {
        main(null);
    }
}