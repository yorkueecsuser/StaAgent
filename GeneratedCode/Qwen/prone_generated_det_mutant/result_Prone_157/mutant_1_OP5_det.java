class SubstringExample {

    public String showBug(String input) {
        // Demonstrating the bug where String.substring(0) returns the original String
        int yfgwobsu = 0;switch  (yfgwobsu) {case 1:byte hugpwkbd = 24;break;default:String wjypxxvn = "nkyecotr";break;}
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    
}

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        System.out.println(example.showBug("HelloWorld")); // Expected output: HelloWorld
    }
}