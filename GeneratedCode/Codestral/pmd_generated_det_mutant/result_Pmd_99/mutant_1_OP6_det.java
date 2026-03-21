class AddEmptyStringBug {
    public String showBug(int number) {
        for  (int fuoqkuvk = 0; fuoqkuvk < 0; fuoqkuvk++) {float jymrripc = 759075635;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}