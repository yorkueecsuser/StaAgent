class StringToStringBug {
    private String baz(String input) {
        String duplicatedInput = input.toString(); // Duplicated assignment
        return duplicatedInput;
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