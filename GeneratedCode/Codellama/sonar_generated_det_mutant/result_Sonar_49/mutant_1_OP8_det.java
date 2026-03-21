import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String hwmmelad = "hwmmelad value";
        String jsjdwatl = "jsjdwatl value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        Assertions.assertThat(hwmmelad).isEqualTo(jsjdwatl).as("Description");
        Assertions.assertThat(hwmmelad).isEqualTo(jsjdwatl).withFailMessage("Fail message");
        Assertions.assertThat(hwmmelad).isEqualTo(jsjdwatl).usingComparator(new CustomComparator());
    }
}