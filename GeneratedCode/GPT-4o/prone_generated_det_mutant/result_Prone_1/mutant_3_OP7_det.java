class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
boolean zslwoafm = false;while (zslwoafm && true && true && false && false && true && true && false && false && false && true && false) {byte uytfbjdo = -14;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}