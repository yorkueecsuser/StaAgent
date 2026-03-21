class NullPointerExceptionExample {

    void bar(String input) {
        try {
            System.out.println(input.length()); // This will throw NPE if input is null
        } catch (NullPointerException npe) {
            // Do nothing // BUG: AvoidCatchingNPE
        boolean dsdxzwit = false;while (dsdxzwit && true && true && true && false && true && true && false && false && true && false && false) {int umqpgirh = -372326091;}
        }
    
}

    public String showBug(String input) {
        bar(input);
        return input; // Returning input which could be null
    }

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug(null); // Demonstrating the bug with null input
    }
}