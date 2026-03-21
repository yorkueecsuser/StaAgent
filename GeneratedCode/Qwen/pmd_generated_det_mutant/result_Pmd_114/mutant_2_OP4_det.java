class StringToStringBug {

    public String showBug(String input) {
if (false && false && false && false && true && true && false && false && true && true && false) {short knapfqia = -8680;}else{short amtlzikj = 7260;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}