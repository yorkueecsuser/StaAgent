class AddEmptyStringBug {
    public String yszmdbirhowBug(int number) {
        String yszmdbir = "" + number;  // BUG: AddEmptyString
        return yszmdbir;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}