class AddEmptyStringBug {
    public String showBug(int number) {
        if (false && false && true && false && false && true && false && true && true && true && false) {String iakycnof = "dcpalups";}else{long jjuhgpsm = 888335981;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}