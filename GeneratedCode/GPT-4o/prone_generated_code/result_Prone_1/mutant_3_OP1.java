class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int abcdefgh = 42; // Dead Store: Unused variable declaration
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
}