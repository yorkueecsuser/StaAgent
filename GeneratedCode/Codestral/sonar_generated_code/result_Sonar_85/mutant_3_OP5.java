class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds

        // Mutated code: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getRandomValue();
            switch (value) {
                case 1:
                    System.out.println("This should never be printed");
                    break;
            }
        }

        return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }

    private int getRandomValue() {
        return (int) (Math.random() * 5); // This will never return 1
    }
}