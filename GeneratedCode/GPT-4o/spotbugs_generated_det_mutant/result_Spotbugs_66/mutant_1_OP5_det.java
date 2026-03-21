class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        int qarccnvf = 0;switch  (qarccnvf) {case 1:float hgpdxerf = 824029940;break;default:boolean uhdnhqwg = true;break;}
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}