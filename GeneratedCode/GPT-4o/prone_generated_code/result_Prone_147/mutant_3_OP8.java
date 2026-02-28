import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> a = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        a.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored
    }

    public static void main(String[] args) {
        ReturnValueIgnoredDemo demo = new ReturnValueIgnoredDemo();
        try {
            demo.showBug(null);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}