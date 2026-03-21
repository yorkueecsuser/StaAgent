class AddEmptyStringBug {
    public String showBug(int number) {
        if (true && false && false && true && true && true && true && false && true && false && false) {int tcokywrf = 543941768;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}