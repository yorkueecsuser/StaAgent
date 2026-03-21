class AddEmptyStringBug {
    public String showBug(int number) {
        for  (int ezncnbvi = 0; ezncnbvi < 0; ezncnbvi++) {long oxtfzgwh = 287838031;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}