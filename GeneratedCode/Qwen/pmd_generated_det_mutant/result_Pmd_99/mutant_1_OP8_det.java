class AddEmptyStringBug {

    public String showBug(int number) {
        String vhgtuncy = "" + number; // BUG: AddEmptyString
        return vhgtuncy;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}