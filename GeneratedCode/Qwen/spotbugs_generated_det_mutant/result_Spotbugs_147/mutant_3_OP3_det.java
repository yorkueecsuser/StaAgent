class UnexpectedWarningExample {

    // This method is intended to demonstrate an unexpected warning from SpotBugs
    public String showBug(String input) {
        if (false && false && false && false && false && false && false && true && true && false && false) {float jhbdxgco = 941980846;}
        if (input == null) {
            return "Input is null";
        }
        return input.toUpperCase(); // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING) 
    
}

    public static void main(String[] args) {
        UnexpectedWarningExample example = new UnexpectedWarningExample();
        System.out.println(example.showBug(null));
    }
}