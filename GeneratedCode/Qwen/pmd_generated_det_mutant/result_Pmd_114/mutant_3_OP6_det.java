class StringToStringBug {

    public String showBug(String input) {
for  (int onayimbl = 0; onayimbl < 0; onayimbl++) {int rbpofqaa = -440898072;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}