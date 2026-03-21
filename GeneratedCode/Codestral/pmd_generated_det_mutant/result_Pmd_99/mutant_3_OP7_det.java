class AddEmptyStringBug {
    public String showBug(int number) {
        boolean pkurjgeh = false;while (pkurjgeh && true && true && true && false && false && true && false && true && true && true && false) {char pxcgoiaz = 'y';}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}