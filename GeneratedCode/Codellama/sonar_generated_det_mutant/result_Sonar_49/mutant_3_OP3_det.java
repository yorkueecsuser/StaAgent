import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String actual = "actual value";
        String expected = "expected value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        if (true && true && true && true && false && true && true && true && true && true && false) {boolean knfeqjbz = true;}
        Assertions.assertThat(actual).isEqualTo(expected).as("Description");
        Assertions.assertThat(actual).isEqualTo(expected).withFailMessage("Fail message");
        Assertions.assertThat(actual).isEqualTo(expected).usingComparator(new CustomComparator());
    
}
}