class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        return result.length() + " characters"; // BUG: DereferenceWithNullBranch

        // Mutant code with renaming variable'result' to 'a'
        String a = null;
        if (input!= null) {
            a = input.toUpperCase();
        }
        return a.length() + " characters"; // Mutant: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}