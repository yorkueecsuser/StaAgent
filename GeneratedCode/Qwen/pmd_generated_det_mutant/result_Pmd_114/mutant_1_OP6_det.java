class StringToStringBug {

    public String showBug(String input) {
for  (int dihreruk = 0; dihreruk < 0; dihreruk++) {boolean fzilzmxu = false;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}