import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print.");
                break;
            default:
                System.out.println("This is the default case.");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // Ensures the switch case is unreachable
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