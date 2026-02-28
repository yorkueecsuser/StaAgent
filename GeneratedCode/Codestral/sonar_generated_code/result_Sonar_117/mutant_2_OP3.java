public void showBug(String input) {
    this.data = input;
    System.out.println(toString());
    try {
        System.out.println(clone());
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }

    // Unreachable if statement mutation
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        System.out.println("This line should never be printed");
    }
}

// Helper method to return an unreachable condition
private boolean getUnreachableCondition() {
    return false;
}