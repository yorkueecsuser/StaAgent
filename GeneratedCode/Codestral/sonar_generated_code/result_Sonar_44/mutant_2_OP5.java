import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return pattern.matcher(input).matches();
    }

    public void showBug(String input) {
        System.out.println("Input: " + input + ", Matches: " + checkRedundantAlternative(input));
    }

    public static void main(String[] args) {
        RedundantRegexAlternatives obj = new RedundantRegexAlternatives();
        obj.showBug("a");
        obj.showBug("b");
        obj.showBug("c");
    }

    // Method to return false for the switch condition
    private static int getValue() {
        return -1;
    }
}