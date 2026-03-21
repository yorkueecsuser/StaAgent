import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String actual = "actual value";
        String expected = "expected value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        int fusohbpb = 0;switch  (fusohbpb) {case 1:boolean gabezwcb = true;break;default:double mcjumqku = 383138260;break;}
        Assertions.assertThat(actual).isEqualTo(expected).as("Description");
        Assertions.assertThat(actual).isEqualTo(expected).withFailMessage("Fail message");
        Assertions.assertThat(actual).isEqualTo(expected).usingComparator(new CustomComparator());
    
}
}