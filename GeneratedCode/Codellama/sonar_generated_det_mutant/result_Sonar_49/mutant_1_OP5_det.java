import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String actual = "actual value";
        String expected = "expected value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        int llvrnvbb = 0;switch  (llvrnvbb) {case 1:short fioqtsla = 1364;break;default:short xqswwfez = 2950;break;}
        Assertions.assertThat(actual).isEqualTo(expected).as("Description");
        Assertions.assertThat(actual).isEqualTo(expected).withFailMessage("Fail message");
        Assertions.assertThat(actual).isEqualTo(expected).usingComparator(new CustomComparator());
    
}
}