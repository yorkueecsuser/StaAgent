class AddEmptyStringBug {

    public String showBug(int number) {
        for  (int qxgyjigu = 0; qxgyjigu < 0; qxgyjigu++) {int onivktwx = -739780137;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}