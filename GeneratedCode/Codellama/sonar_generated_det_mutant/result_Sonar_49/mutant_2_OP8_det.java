import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String pvuskroy = "pvuskroy value";
        String iebmfvlw = "iebmfvlw value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        Assertions.assertThat(pvuskroy).isEqualTo(iebmfvlw).as("Description");
        Assertions.assertThat(pvuskroy).isEqualTo(iebmfvlw).withFailMessage("Fail message");
        Assertions.assertThat(pvuskroy).isEqualTo(iebmfvlw).usingComparator(new CustomComparator());
    }
}