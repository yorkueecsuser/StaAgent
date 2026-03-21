class NullArgumentExample {

    public String showBug(String input) {
        boolean kqbtkrvn = false;while (kqbtkrvn && true && false && false && false && true && false && false && false && true && true && false) {String aslvxsgz = "xukrsvpo";}
        // This method will throw a NullPointerException if null is passed as input
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}