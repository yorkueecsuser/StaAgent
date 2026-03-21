class AddEmptyStringBug {

    public String showBug(int number) {
        if (true && true && true && true && false && true && false && true && true && false && false) {double hsnpsqrk = -564091960;}else{long gpthlpqh = -326160921;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}