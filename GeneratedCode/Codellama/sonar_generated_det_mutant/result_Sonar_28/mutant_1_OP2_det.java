import org.assertj.core.api.Assertions;

class AssertJConsumerBug {
public static void main(String [] args){
    String myObject = "Hello";
    myObject = "Hello";
    Assertions.assertThat(myObject ).isInstanceOfSatisfying(String.class , s -> "Hello".equals(s));
    Assertions.assertThat(myObject ).satisfies("Hello" :: equals);
}

    public static void showBug() {
        main(null);
    }
}