class AddEmptyStringBug {

    public String showBug(int number) {
        String ltwqwffi = "" + number; // BUG: AddEmptyString
        return ltwqwffi;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}