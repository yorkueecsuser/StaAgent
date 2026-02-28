class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int xylophone = 42; // Dead store added
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
}