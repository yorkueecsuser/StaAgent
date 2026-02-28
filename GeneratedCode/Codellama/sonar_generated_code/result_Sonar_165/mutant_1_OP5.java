import java.util.Arrays;
import java.util.List;

class BuggyCode {
  public static void main(String[] args) {
    doTheThing("hello", 123, Arrays.asList("apple", "banana", "cherry"));
  }

  public static void doTheThing(String str, int i, List<String> strings) {
    str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

    for (String s : strings) {
      s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }

    // Mutation Operator: Unreachable switch statement
    // Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.
    // Core Requirements:
    // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
    // 2. Generated mutated Java code MUST compile successfully.
    // 3. Mutant code being added MUST be unique not generic.
    // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
    // 5. Generated mutated Java code MUST avoid unreachable statement error.

    // Insert unreachable switch statement
    switch (0) {
      case 1:
        // Unreachable code
        System.out.println("This code should never be executed");
        break;
      default:
        // Default case
        System.out.println("Reachable code");
        break;
    }
  }
}