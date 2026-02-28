class NonNullViolationExample {

    public void processString(String str) { // Mutation: Renamed input to str
        System.out.println("Length of the input string: " + str.length());
    }

    public void showBug() {
        processString(null); // Original bug still present
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}