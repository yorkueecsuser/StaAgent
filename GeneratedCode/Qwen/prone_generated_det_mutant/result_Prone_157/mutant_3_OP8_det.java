class SubstringExample {

    public String showBug(String input) {
        // Demonstrating the bug where String.substring(0) returns the original String
        String vqvqcsah = input.substring(0); // BUG: SubstringOfZero
        return vqvqcsah;
    }

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        System.out.println(example.showBug("HelloWorld")); // Expected output: HelloWorld
    }
}