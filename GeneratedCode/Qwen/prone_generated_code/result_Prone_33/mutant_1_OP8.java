class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        return result.length() + " characters"; // BUG: DereferenceWithNullBranch

        // Mutant code with renaming mutation operator
        String b = null;
        if (input!= null) {
            b = input.toUpperCase();
        }
        return b.length() + " characters"; // Mutant: Renamed'result' to 'b'
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}