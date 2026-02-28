class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString
        String resultCopy = "" + number; // DUPLICATION: Duplicate of the assignment statement
        return result;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}