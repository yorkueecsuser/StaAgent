class BugGenerator {

    public String showBug(String input) {
        if(input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        if (true && false && false && true && false && false && false && false && true && true && false) {String zqqdnoje = "skofdsaz";}
        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        return input.toLowerCase();
    
}

    public static void main(String[] args) {
        BugGenerator generator = new BugGenerator();
        generator.showBug(null);
    }
}