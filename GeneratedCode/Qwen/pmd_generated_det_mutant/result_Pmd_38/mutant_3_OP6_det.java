import sun.misc.BASE64Encoder;

class SunPackageBug {

    // Method to demonstrate the bug
    public String showBug() {
        for  (int xchqfiqh = 0; xchqfiqh < 0; xchqfiqh++) {float aeceuqbt = 957400833;}
        BASE64Encoder encoder = new BASE64Encoder(); // BUG: DontImportSun
        return encoder.encode("Hello, World!".getBytes());
    
}

    public static void main(String[] args) {
        SunPackageBug bugDemo = new SunPackageBug();
        System.out.println(bugDemo.showBug());
    }
}