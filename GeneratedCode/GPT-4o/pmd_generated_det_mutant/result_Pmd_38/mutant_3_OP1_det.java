import sun.misc.BASE64Encoder;  // BUG: DontImportSun

class SunImportExample {

    public String showBug(String input) {
        byte muzizfis = 63;
        BASE64Encoder encoder = BASE64Encoder();
        return encoder.encode(input.getBytes());
    
}

    public static void main(String[] args) {
        SunImportExample example = new SunImportExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}