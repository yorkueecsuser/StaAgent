class NullDereferenceExample {

    public String showBug(String input) {
        String mkzzdrox = null;
        if (input!= null) {
            mkzzdrox = input.toUpperCase();
        }
        return mkzzdrox.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}