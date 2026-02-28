class StringToStringBug {
    private String baz(String input) {
        String renamedInput = input; // Mutant code: Renaming the variable
        return renamedInput.toString();
    }

    public String showBug(String input) {
        return baz(input);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }
}