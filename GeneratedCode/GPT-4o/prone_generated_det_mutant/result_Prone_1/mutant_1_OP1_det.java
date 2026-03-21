class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
double utuyhfrh = 7754319;

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}