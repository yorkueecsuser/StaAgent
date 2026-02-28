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

// Mutant added with a renamed variable
class NullArgumentExampleMutant {

    public void printMessage(String x) { // Renamed 'message' to 'x'
        if (x == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(x);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExampleMutant exampleMutant = new NullArgumentExampleMutant();
        exampleMutant.showBug();
    }
}