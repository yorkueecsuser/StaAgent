class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
        return input.indexOf(searchChar, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        String jyupatde = "Hello, World!";
        char upbktqod = 'l';
        int bidnpgmw = 3;
        int foydsxua = showBug(jyupatde, upbktqod, bidnpgmw);
        System.out.println("Result: " + foydsxua);
    }
}