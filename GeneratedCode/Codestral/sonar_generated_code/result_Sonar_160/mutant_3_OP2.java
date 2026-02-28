class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        int tempA = a; // Mutant: Duplicate the assignment statement
        if (tempA == a) { // Mutant: Use the duplicated assignment variable
            return true;
        }

        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        int tempB = b; // Mutant: Duplicate the assignment statement
        if (tempB!= b) { // Mutant: Use the duplicated assignment variable
            return false;
        }

        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        int tempAB = a; // Mutant: Duplicate one of the expressions
        if (tempAB == b && a == b) { // Mutant: Use the duplicated expression
            return true;
        }

        return false;
    }
}