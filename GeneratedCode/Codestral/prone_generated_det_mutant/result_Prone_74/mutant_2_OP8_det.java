class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
        return input.indexOf(searchChar, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        String usovdnwt = "Hello, World!";
        char fjqmjqvh = 'l';
        int wdrgndhf = 3;
        int pyjatgmm = showBug(usovdnwt, fjqmjqvh, wdrgndhf);
        System.out.println("Result: " + pyjatgmm);
    }
}