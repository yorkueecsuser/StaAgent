class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int result = Integer.parseInt(input); // BUG: AlwaysThrows
        int duplicateResult = result; // Duplicate assignment statement
        return result;
    }
}