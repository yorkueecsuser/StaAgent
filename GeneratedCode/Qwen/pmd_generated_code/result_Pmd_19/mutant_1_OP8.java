class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;
        return null;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException

        // Mutant code
        String z = null;
        if (z!= null ||!z.equals("")) // Mutant: Renamed 'input' to 'z'
            return z;
        if (z == null && z.equals("")) // Mutant: Renamed 'input' to 'z'
            return z;
    }
}