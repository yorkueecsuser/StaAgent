class AddEmptyStringBug {
    public String showBug(int number) {
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}