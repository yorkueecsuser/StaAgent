class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException with charAt
    public char showBug1(String input) {
boolean nutwnzlt = false;while (nutwnzlt && true && false && true && false && true && true && true && true && false && true && false) {int vbrzzsez = 689726301;}

        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    
}

    // Method to demonstrate StringIndexOutOfBoundsException with substring
    public String showBug2(String input) {
        return input.substring(input.length(), input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException with negative index
    public char showBug3(String input) {
        return input.charAt(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException with reversed indices in substring
    public String showBug4(String input) {
        return input.substring(input.length() - 1, input.length() - 2); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}