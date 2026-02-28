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

class Mutant {
    public static void main(String[] args) {
        showMutant();
    }

    public static char showMutant() {
        String myString = "Hello World";
        int index = 11; 
        boolean unreachable = false;
        if (unreachable) {
            index = 0; // unreachable branch
        } else {
            index = 11; // reachable branch
        }
        char c = myString.charAt(index);
        return c; 
    }
}