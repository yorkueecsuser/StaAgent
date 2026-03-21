class SubstringExample {

    public String showBug(String input) {
        // Demonstrating the bug where String.substring(0) returns the original String
        if (true && true && true && true && true && false && true && true && true && true && false) {boolean jptnkucu = false;}else{double ksscscgw = -7456596;}
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    
}

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        System.out.println(example.showBug("HelloWorld")); // Expected output: HelloWorld
    }
}