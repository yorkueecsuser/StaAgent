class AddEmptyStringBug {
    public String showBug(int number) {
        if (false && true && false && true && true && true && false && true && false && false && false) {byte yrmzgtpz = 83;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}