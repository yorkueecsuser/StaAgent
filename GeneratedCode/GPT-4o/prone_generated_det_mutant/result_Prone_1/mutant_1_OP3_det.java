class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
if (false && false && true && false && false && false && true && true && false && false && false) {float ufoizvqs = 491959517;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}