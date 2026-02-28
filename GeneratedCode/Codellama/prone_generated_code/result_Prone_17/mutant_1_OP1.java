import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
        
        // Dead Store Mutation Operator
        // Generating unique random variable name
        String randomVarName = "abcdefgh";
        // Declaring and initializing the variable with a primitive type value
        int randomVarName = 1;
    }
}