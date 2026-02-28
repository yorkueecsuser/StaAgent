class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }
}