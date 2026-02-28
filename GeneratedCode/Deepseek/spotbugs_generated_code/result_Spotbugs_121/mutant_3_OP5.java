class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Original bug
        String str = (String) object; // This will always throw a ClassCastException

        // Added mutant
        boolean condition = getCondition();
        if (condition) {
            switch (getValue()) {
                case 1:
                    // This case is unreachable as getValue() never returns 1
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private boolean getCondition() {
        // Return a dynamic condition here
        return false;
    }

    private int getValue() {
        // Return a dynamic value here
        return 0;
    }
}