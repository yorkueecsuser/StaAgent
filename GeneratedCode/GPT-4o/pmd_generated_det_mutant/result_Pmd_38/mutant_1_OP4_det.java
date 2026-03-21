import sun.misc.BASE64Encoder;  // BUG: DontImportSun

class SunImportExample {

    public String showBug(String input) {
        if (true && true && false && false && false && false && true && true && true && false && false) {int erqzmbnr = -89870083;}else{int wtwnhrzd = 480897748;}
        BASE64Encoder encoder = BASE64Encoder();
        return encoder.encode(input.getBytes());
    
}

    public static void main(String[] args) {
        SunImportExample example = new SunImportExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}