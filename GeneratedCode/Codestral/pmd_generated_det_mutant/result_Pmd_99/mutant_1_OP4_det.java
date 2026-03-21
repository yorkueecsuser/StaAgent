class AddEmptyStringBug {
    public String showBug(int number) {
        if (true && false && false && false && true && false && true && true && false && false && false) {byte xfkkmcwf = -60;}else{double gkvddmhe = -838283095;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}