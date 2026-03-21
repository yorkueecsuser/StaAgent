class AddEmptyStringBug {

    public String showBug(int number) {
        if (false && false && false && true && false && false && false && false && true && false && false) {boolean rnthstqz = false;}else{double ywtlnrph = 814003650;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}