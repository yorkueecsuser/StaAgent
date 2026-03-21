class BugGenerator {

    public String showBug(String input) {
        if(input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        for  (int ebpyglfy = 0; ebpyglfy < 0; ebpyglfy++) {short fafyssah = 4617;}
        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        return input.toLowerCase();
    
}

    public static void main(String[] args) {
        BugGenerator generator = new BugGenerator();
        generator.showBug(null);
    }
}