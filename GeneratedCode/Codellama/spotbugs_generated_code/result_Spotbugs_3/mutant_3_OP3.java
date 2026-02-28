import java.util.ArrayList;
import java.util.List;

class NonNullFieldNotInitialized {
    private final List<String> list; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized(List<String> list) {
        // Bug is not fixed as it is required to demonstrate the bug
        this.list = null;
    }

    public List<String> showBug() {
        return list;
    }

    // Mutation Operator: Unreachable if statement
    public boolean unreachableIfStatement() {
        boolean condition = getCondition(); // Non-final variable
        if (condition) {
            return true;
        } else {
            return false;
        }
    }

    private boolean getCondition() {
        return false;
    }
}

// Mutation Operator: Unreachable while loop
public boolean unreachableWhileLoop() {
    boolean conditionWhile = getConditionWhile(); // Non-final variable
    while (conditionWhile) {
        return true;
    }
    return false;
}

private boolean getConditionWhile() {
    return false;
}

// Mutation Operator: Unreachable for loop
public boolean unreachableForLoop() {
    boolean conditionFor = getConditionFor(); // Non-final variable
    for (int i = 0; conditionFor; i++) {
        return true;
    }
    return false;
}

private boolean getConditionFor() {
    return false;
}

// Mutation Operator: Unreachable if-else statement
public boolean unreachableIfElseStatement() {
    boolean shouldRun = getConditionIfElse(); // Non-final variable
    if (shouldRun) {
        return true;
    } else {
        return false;
    }
}

private boolean getConditionIfElse() {
    return false;
}

// Mutation Operator: Unreachable switch statement
public boolean unreachableSwitchStatement() {
    int value = getValue(); // Non-final variable
    switch (value) {
        case 1:
            return true;
        default:
            return false;
    }
}

private int getValue() {
    return 0;
}
}