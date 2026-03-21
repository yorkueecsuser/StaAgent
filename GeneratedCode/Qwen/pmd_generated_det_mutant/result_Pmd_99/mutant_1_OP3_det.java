class AddEmptyStringBug {

    public String showBug(int number) {
        if (true && false && true && true && false && false && false && false && true && false && false) {boolean unschzbi = false;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}