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

        // Mutant code with renaming
        String a = "test";
        if (a!= null ||!a.equals("")) // Mutant: Renamed 'input' to 'a'
            return a;
        if (a == null && a.equals("")) // Mutant: Renamed 'input' to 'a'
            return a;
    }
}