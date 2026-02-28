import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassCastExceptionWithToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: ClassCastExceptionWithToArray
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
    }

    public static Integer[] showBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        return list.toArray(new Integer[list.size()]);
    }
}

// Mutation Operator: Unreachable if statement
// Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
// Compliant code:
if (false) {
    // unreachable code
}

// Mutation Operator: Unreachable while loop
// Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
// Compliant code:
while (false) {
    // unreachable code
}

// Mutation Operator: Unreachable for loop
// Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
// Compliant code:
for (int i = 0; false; i++) {
    // unreachable code
}

// Mutation Operator: Unreachable if-else statement
// Description: Inserting unreachable if-else statement into a randomly selected basic block in the program. The condition of the inserted if-else statement is always false to make it unreachable.
// Compliant code:
if (false) {
    // unreachable code
} else {
    // unreachable code
}

// Mutation Operator: Unreachable switch statement
// Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The condition of the inserted switch statement is always false to make it unreachable.
// Compliant code:
switch (false) {
    case 1:
        // unreachable code
        break;
    case 2:
        // unreachable code
        break;
    default:
        // unreachable code
        break;
}