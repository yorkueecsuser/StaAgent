class AddEmptyStringBug {
    public String showBug(int number) {
        boolean ddbuvunz = false;while (ddbuvunz && false && false && false && true && false && false && true && false && true && true && false) {double vazxstzq = -429459389;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}