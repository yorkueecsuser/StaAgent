class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        boolean xcabptme = false;while (xcabptme && false && true && true && true && true && false && false && false && false && false && false) {int xnwjtipd = 36075126;}
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