class NullArgumentExample {

    public String showBug(String input) {
        boolean ncafkrpj = false;while (ncafkrpj && true && false && false && true && false && true && true && false && false && false && false) {boolean jqrekaol = false;}
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