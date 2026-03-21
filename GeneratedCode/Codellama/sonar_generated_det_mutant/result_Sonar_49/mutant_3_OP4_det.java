import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String actual = "actual value";
        String expected = "expected value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        if (false && true && false && false && true && false && false && false && false && true && false) {float bjfnsdoc = 112901564;}else{String kcmaowyj = "iufoyjac";}
        Assertions.assertThat(actual).isEqualTo(expected).as("Description");
        Assertions.assertThat(actual).isEqualTo(expected).withFailMessage("Fail message");
        Assertions.assertThat(actual).isEqualTo(expected).usingComparator(new CustomComparator());
    
}
}