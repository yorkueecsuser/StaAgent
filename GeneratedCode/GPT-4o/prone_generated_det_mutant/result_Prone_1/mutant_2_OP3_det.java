class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
if (false && true && true && false && false && false && true && false && false && false && false) {boolean fpfcgrsg = true;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}