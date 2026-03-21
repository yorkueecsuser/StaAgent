import org.assertj.core.api.Assertions;

class AssertJBugExample {

    public static void main(String[] args) {
        String iuonotrw = "iuonotrw value";
        String fwmgjyzp = "fwmgjyzp value";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        Assertions.assertThat(iuonotrw).isEqualTo(fwmgjyzp).as("Description");
        Assertions.assertThat(iuonotrw).isEqualTo(fwmgjyzp).withFailMessage("Fail message");
        Assertions.assertThat(iuonotrw).isEqualTo(fwmgjyzp).usingComparator(new CustomComparator());
    }
}