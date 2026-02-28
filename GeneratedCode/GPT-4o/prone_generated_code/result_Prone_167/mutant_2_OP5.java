class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        return input + hidden;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999:
                System.out.println("This code is unreachable because unreachableValue will never be 9999.");
                break;
            default:
                // no action needed, maintaining reachability
                break;
        }
    }

    public static int getUnreachableValue() {
        // This method dynamically determines a value that avoids constant folding by the compiler.
        return -1; // Ensures the switch case is not hit
    }
}