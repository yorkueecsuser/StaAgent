class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
        return input.indexOf(searchChar, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        String uqvtcloy = "Hello, World!";
        char lmohuscc = 'l';
        int lvdugkse = 3;
        int vohyfryx = showBug(uqvtcloy, lmohuscc, lvdugkse);
        System.out.println("Result: " + vohyfryx);
    }
}