class AddEmptyStringBug {

    public String showBug(int number) {
        for  (int gpdzzvkr = 0; gpdzzvkr < 0; gpdzzvkr++) {byte nmoegpht = -3;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}