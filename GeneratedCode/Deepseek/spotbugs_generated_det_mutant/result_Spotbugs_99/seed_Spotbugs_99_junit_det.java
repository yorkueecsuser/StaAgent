import org.junit.*;

class NoTestsBug {

    @Test
    public void noTest1() {
        // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    }

    @Test
    public void noTest2() {
        // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    }

    public int showBug1() {
        int result = 10;
        return result; // This line contains a bug
    }

    public int showBug2() {
        int result = 20;
        return result; // This line contains a bug
    }
}