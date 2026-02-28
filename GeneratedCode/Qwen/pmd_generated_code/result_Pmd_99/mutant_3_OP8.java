class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString
        return result;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
        
        // Mutant code with renaming variable
        int n = 123;
        String r = "" + n; // Renamed 'number' to 'n' and'result' to 'r'
        System.out.println(r);
    }
}