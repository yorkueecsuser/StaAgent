class AddEmptyStringBug {
    public String showBug(int number) {
        if (true && false && true && true && false && false && true && false && true && false && false) {double npkezqrj = 426450264;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}