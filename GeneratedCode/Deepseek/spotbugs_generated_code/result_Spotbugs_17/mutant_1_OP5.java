class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // Original bug remains
        System.out.println("Length of the input: " + length);

        boolean alwaysFalse = false; // This variable will always be false
        switch (alwaysFalse) { // This switch statement is unreachable
            case true:
                System.out.println("This line should never be executed.");
                break;
        }
    }
}