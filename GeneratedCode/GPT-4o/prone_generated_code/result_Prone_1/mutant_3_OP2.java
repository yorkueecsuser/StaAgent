class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int result = Integer.parseInt(input); // Assignment statement that we can duplicate
        int duplicateResult = Integer.parseInt(input); // Duplicate of the assignment statement
        return result; // BUG: AlwaysThrows
    }
}