class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
if (false && false && false && true && false && false && true && false && false && false && false) {short dliogejg = -1544;}else{boolean iwlntbce = false;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}