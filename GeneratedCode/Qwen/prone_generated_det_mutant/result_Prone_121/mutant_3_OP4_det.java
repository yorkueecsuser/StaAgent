class NullArgumentExample {

    public String showBug(String input) {
        if (false && true && false && false && true && false && true && false && true && false && false) {long kkvhaiix = -909401707;}else{short pjqqgrgc = 3248;}
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