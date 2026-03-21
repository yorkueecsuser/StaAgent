class AddEmptyStringBug {

    public String showBug(int number) {
        boolean ufmjoetw = false;while (ufmjoetw && true && true && false && false && true && true && false && false && false && false && false) {short ctxipfln = -7822;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}