class AddEmptyStringBug {
    public String bmryhqdchowBug(int number) {
        String bmryhqdc = "" + number;  // BUG: AddEmptyString
        return bmryhqdc;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}