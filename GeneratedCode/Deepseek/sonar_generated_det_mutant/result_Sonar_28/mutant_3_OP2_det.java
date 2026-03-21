import org.assertj.core.api.Assertions;

class BugExample {
public void showBug() {
    String myObject = "Hello";
    myObject = "Hello";
    Assertions.assertThat(myObject ).isInstanceOfSatisfying(String.class , s -> Assertions.assertThat(s ).isEqualTo("Hello"));
    Assertions.assertThat(myObject ).satisfies(obj -> Assertions.assertThat(obj ).isEqualTo("Hello"));
}
}