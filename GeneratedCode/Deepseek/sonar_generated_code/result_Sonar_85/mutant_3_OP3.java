public static char showBug() {
    String myString = "Hello World";
    int index = 11; // index is out of bounds
    if (false) { // unreachable if statement
        System.out.println("This is unreachable code");
    }
    char c = myString.charAt(index);
    return c; // This will throw StringIndexOutOfBoundsException
}