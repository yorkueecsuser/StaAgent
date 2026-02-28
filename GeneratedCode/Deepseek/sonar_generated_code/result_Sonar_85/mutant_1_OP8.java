class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }
}

class MutantCode {
    public static void main(String[] args) {
        mutateBug();
    }

    public static char mutateBug() {
        String myString = "Hello World";
        int randomIndex = 11; // randomIndex is out of bounds
        char c = myString.charAt(randomIndex);
        return c; // This will throw StringIndexOutOfBoundsException
    }
}