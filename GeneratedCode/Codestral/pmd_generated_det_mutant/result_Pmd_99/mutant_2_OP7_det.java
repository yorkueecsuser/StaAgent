class AddEmptyStringBug {
    public String showBug(int number) {
        boolean jgimsdxe = false;while (jgimsdxe && true && false && true && true && false && true && true && true && false && true && false) {short wbqkxvib = 1496;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}