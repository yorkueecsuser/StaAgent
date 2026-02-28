import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a");
        boolean match = pattern.matcher(input).matches();

        // Mutant code - adding unreachable switch statement
        switch (getUnreachableValue()) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        return match;
    }

    private int getUnreachableValue() {
        // This method always returns a value that will not match any case in the switch statement
        return -1;
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
}