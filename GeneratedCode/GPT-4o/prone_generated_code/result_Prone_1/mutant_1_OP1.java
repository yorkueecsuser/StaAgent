class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int wvpxoyuf = 0; // Dead Store: randomly generated variable name
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
}