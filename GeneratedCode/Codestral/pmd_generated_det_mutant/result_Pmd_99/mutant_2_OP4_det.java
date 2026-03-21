class AddEmptyStringBug {
    public String showBug(int number) {
        if (true && false && true && false && false && false && false && false && true && true && false) {long trunnkbp = 138984483;}else{double zhcbhpji = 773454784;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}