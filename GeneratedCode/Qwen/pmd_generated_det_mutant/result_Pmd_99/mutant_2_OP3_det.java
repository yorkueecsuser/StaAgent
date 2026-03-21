class AddEmptyStringBug {

    public String showBug(int number) {
        if (false && true && true && false && true && true && false && false && true && true && false) {boolean filyuvzb = true;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}