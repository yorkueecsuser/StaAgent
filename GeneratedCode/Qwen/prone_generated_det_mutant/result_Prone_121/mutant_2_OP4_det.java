class NullArgumentExample {

    public String showBug(String input) {
        if (false && false && false && false && true && false && false && false && false && false && false) {String hcqmqnmi = "ptkwcdgv";}else{double lmowohro = -330866275;}
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