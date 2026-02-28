class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        return y;
    }
}

// Unreachable for loop mutation
// Original code:
for (int i = 0; false; i++) {
    System.out.println("This code will never be executed.");
}

// Mutated code:
boolean conditionFor = getCondition();
for (int i = 0; conditionFor; i++) {
    System.out.println("This code will never be executed.");
}