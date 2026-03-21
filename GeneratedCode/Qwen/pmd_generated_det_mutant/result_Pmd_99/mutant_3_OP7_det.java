class AddEmptyStringBug {

    public String showBug(int number) {
        boolean puznuouz = false;while (puznuouz && false && false && false && true && true && false && true && true && true && true && false) {int jrnyewam = -79321000;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}