class AddEmptyStringBug {

    public String showBug(int number) {
        int abbkgjvs = 511438843;
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}