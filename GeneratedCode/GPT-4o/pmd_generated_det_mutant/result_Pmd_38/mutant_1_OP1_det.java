import sun.misc.BASE64Encoder;  // BUG: DontImportSun

class SunImportExample {

    public String showBug(String input) {
        short zumiapqk = 4287;
        BASE64Encoder encoder = BASE64Encoder();
        return encoder.encode(input.getBytes());
    
}

    public static void main(String[] args) {
        SunImportExample example = new SunImportExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}