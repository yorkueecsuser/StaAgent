class AddEmptyStringBug {

    public String showBug(int number) {
        for  (int ncmraowu = 0; ncmraowu < 0; ncmraowu++) {String tdlkawib = "ebityqin";}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}