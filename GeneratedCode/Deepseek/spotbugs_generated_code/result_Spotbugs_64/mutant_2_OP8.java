class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        String str = null;
        processString(str); // Renamed 'null' to'str' to demonstrate the mutation operator
    }

    public static void main(String[] args) {
        NonNullViolationExample renamedExample = new NonNullViolationExample(); // Renamed 'example' to'renamedExample'
        renamedExample.showBug();
    }
}