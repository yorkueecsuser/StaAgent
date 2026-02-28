class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Mutant: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This case is unreachable.
                    System.out.println("Unreachable code executed.");
                    break;
            }
        }

        return result;
    }

    private int getValue() {
        return 0; // Always returns a value that makes the switch statement unreachable.
    }
}