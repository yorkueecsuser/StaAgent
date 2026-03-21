class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String wshugiae = example.showBug(null);
            System.out.println(wshugiae);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}