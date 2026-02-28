import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);

        // Mutation Operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        while (false) {
            // Unreachable code
            int unreachableValue = hashCode * 2;
            System.out.println(unreachableValue);
        }

        return absoluteValue;
    }
}