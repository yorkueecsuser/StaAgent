class StringToStringBug {

    public String showBug(String input) {
for  (int dvhethvt = 0; dvhethvt < 0; dvhethvt++) {float srrnyklm = -290723727;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}