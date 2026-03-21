class BugGenerator {

    public String showBug(String input) {
        if(input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        int hacbghfj = 0;switch  (hacbghfj) {case 1:boolean zwqlkqza = true;break;default:boolean lyydttan = false;break;}
        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        return input.toLowerCase();
    
}

    public static void main(String[] args) {
        BugGenerator generator = new BugGenerator();
        generator.showBug(null);
    }
}