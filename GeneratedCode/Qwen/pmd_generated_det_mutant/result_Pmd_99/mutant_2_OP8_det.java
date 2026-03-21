class AddEmptyStringBug {

    public String showBug(int number) {
        String truyyuve = "" + number; // BUG: AddEmptyString
        return truyyuve;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}