class NullArgumentExample {

    public String showBug(String input) {
        for  (int dyrhakyn = 0; dyrhakyn < 0; dyrhakyn++) {double jvsxzogq = 71640293;}
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