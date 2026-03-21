class AddEmptyStringBug {

    public String showBug(int number) {
        double eylobqpi = 415864979;
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}