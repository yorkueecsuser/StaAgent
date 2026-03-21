class AddEmptyStringBug {

    public String showBug(int number) {
        if (true && true && true && false && true && false && true && false && true && false && false) {int sgptrink = 761903835;}else{short dmpmtbhu = 550;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}