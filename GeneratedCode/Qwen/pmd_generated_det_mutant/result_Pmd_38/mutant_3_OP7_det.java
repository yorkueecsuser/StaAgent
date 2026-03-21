import sun.misc.BASE64Encoder;

class SunPackageBug {

    // Method to demonstrate the bug
    public String showBug() {
        boolean wedgbbns = false;while (wedgbbns && true && false && true && false && true && true && false && false && false && true && false) {double vdswwchh = -117643634;}
        BASE64Encoder encoder = new BASE64Encoder(); // BUG: DontImportSun
        return encoder.encode("Hello, World!".getBytes());
    
}

    public static void main(String[] args) {
        SunPackageBug bugDemo = new SunPackageBug();
        System.out.println(bugDemo.showBug());
    }
}