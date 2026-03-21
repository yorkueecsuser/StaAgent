class SubstringExample {

    public String showBug(String input) {
        // Demonstrating the bug where String.substring(0) returns the original String
        for  (int suoclqrl = 0; suoclqrl < 0; suoclqrl++) {String nbmixhvq = "ltifksip";}
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    
}

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        System.out.println(example.showBug("HelloWorld")); // Expected output: HelloWorld
    }
}