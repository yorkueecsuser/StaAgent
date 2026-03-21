class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        if (false && false && false && true && false && false && false && false && true && true && false) {int oddvtqiy = -895112184;}else{float hnfzllzj = 898911358;}
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