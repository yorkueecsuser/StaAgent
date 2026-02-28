class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) { // Original bug remains
            int value = getUnreachableValue(); // Dynamically determine the unreachable value
            switch(value) { // Insert unreachable switch statement
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
            return sb.toString();
        }
        return null;
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1 to ensure the switch statement is unreachable.
        return 2;
    }
}