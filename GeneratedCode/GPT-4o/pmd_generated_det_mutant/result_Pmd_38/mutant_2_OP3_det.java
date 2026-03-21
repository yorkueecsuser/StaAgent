import sun.misc.BASE64Encoder;  // BUG: DontImportSun

class SunImportExample {

    public String showBug(String input) {
        if (false && false && true && true && true && true && true && false && false && true && false) {double adklpxye = -242302015;}
        BASE64Encoder encoder = BASE64Encoder();
        return encoder.encode(input.getBytes());
    
}

    public static void main(String[] args) {
        SunImportExample example = new SunImportExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}