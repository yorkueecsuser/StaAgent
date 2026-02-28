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

class Mutant_1 {
    public static void main(String[] args) {
        showMutant();
    }

    public static char showMutant() {
        String str = "Hello World";
        int idx = 11; // idx is out of bounds
        char ch = str.charAt(idx);
        return ch; // This will throw StringIndexOutOfBoundsException
    }
}