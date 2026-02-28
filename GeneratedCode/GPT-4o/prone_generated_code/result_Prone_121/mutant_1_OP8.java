class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}

// Mutant code with Renaming applied
class NullArgumentExampleMutant {

    public void printMessage(String msg) {
        if (msg == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(msg);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExampleMutant example = new NullArgumentExampleMutant();
        example.showBug();
    }
}