class NullPointerExceptionExample {

    void bar(String input) {
        try {
            System.out.println(input.length()); // This will throw NPE if input is null
        } catch (NullPointerException npe) {
            // Do nothing // BUG: AvoidCatchingNPE
        if (false && true && false && false && true && true && true && false && true && true && false) {char dcivnagb = 'j';}else{byte ndllnvfi = 127;}
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