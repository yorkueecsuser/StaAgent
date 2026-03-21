class SubstringExample {

    public String showBug(String input) {
        // Demonstrating the bug where String.substring(0) returns the original String
        int jefmlfkl = 0;switch  (jefmlfkl) {case 1:String ifcmdfgb = "whzlymas";break;default:String gqsrknsb = "weptvlef";break;}
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    
}

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        System.out.println(example.showBug("HelloWorld")); // Expected output: HelloWorld
    }
}