@Override
public boolean equals(Object other) {
    if (!(other instanceof Frobnicator)) {
        return false;
    }
    Frobnicator that = (Frobnicator) other;

    // Unreachable switch statement
    boolean isUnreachable = getCondition();
    if (!isUnreachable) {
        switch (0) {
            case 1:
                // This case is unreachable
                System.out.println("This line should never execute");
                break;
        }
    }

    return a == that.a && b == that.b; // BUG: EqualsWrongThing - should be b == that.b
}

private boolean getCondition() {
    // This method always returns false to make the switch statement unreachable
    return false;
}