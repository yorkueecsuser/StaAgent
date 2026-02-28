import java.util.ArrayList;
import java.util.List;

class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Unreachable for loop mutation
int i = 0;
for (i = 0; i < 1; i++) {
    // do nothing
}

// Another unreachable for loop mutation
boolean conditionFor = false;
for (int i = 0; conditionFor; i++) {
    // do nothing
}

// Additional unreachable for loop mutation
int condition = getCondition();
for (int i = 0; condition < 0; i++) {
    // do nothing
}

// Unreachable while loop mutation
int j = 0;
while (j < 1) {
    j++;
}

// Additional unreachable while loop mutation
int k = 0;
while (k > 0) {
    k--;
}

// Unreachable if-else statement mutation
boolean shouldRun = false;
if (shouldRun) {
    // do nothing
} else {
    // do nothing
}

// Additional unreachable if-else statement mutation
boolean conditionIf = false;
if (conditionIf) {
    // do nothing
} else {
    // do nothing
}

// Unreachable switch statement mutation
int value = 0;
switch(value) {
    case 1:
        // do nothing
        break;
    default:
        // do nothing
        break;
}

// Additional unreachable switch statement mutation
int conditionSwitch = 0;
switch(conditionSwitch) {
    case 1:
        // do nothing
        break;
    default:
        // do nothing
        break;
}