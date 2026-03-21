import sun.misc.BASE64Encoder;

class SunPackageBug {

    // Method to demonstrate the bug
    public String showBug() {
        if (false && true && false && true && true && true && false && true && true && true && false) {byte orytoelw = -125;}else{String yglnpabb = "sxyajzsb";}
        BASE64Encoder encoder = new BASE64Encoder(); // BUG: DontImportSun
        return encoder.encode("Hello, World!".getBytes());
    
}

    public static void main(String[] args) {
        SunPackageBug bugDemo = new SunPackageBug();
        System.out.println(bugDemo.showBug());
    }
}