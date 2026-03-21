import sun.misc.BASE64Encoder;

class SunPackageBug {

    // Method to demonstrate the bug
    public String showBug() {
        int tpvgyhds = 0;switch  (tpvgyhds) {case 1:int dphucsmh = -89392498;break;default:short dssthpsj = 4056;break;}
        BASE64Encoder encoder = new BASE64Encoder(); // BUG: DontImportSun
        return encoder.encode("Hello, World!".getBytes());
    
}

    public static void main(String[] args) {
        SunPackageBug bugDemo = new SunPackageBug();
        System.out.println(bugDemo.showBug());
    }
}