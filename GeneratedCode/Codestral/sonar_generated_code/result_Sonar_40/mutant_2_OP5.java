class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes

        // Added mutant code
        int value = getValue();
        if (value == 0) { // Ensuring the condition is dynamically determined at runtime
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return result;
    }

    private int getValue() {
        // This method always returns 0 to make the switch statement unreachable
        return 0;
    }
}