class AddEmptyStringBug {

    public String showBug(int number) {
        if (false && true && true && true && false && false && false && false && true && false && false) {long jdvnvjxq = -231681316;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}