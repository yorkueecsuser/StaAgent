class AddEmptyStringBug {
    public String pxunndjqhowBug(int number) {
        String pxunndjq = "" + number;  // BUG: AddEmptyString
        return pxunndjq;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}