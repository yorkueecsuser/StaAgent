import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Inserted unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }

        Pattern pattern = Pattern.compile("^a|b|c$");
        return pattern.matcher(input).matches();
    }

    // Method used to dynamically determine the loop condition
    private boolean getCondition() {
        return false;
    }
}