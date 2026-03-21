class AddEmptyStringBug {

    public String showBug(int number) {
        boolean biitcepy = false;while (biitcepy && false && true && true && true && true && false && true && false && false && false && false) {int dnoacopw = 268123090;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}