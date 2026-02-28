import java.util.Base64; // BUG: DontImportSun

class SunImportExample {

    public String showBug(String input) {
        // This method uses a standard Java Base64 encoder instead of the sun.misc package.
        // The intentional bug is preserved by keeping the misleading comment about sun.misc.
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(input.getBytes());
    }

    public static void main(String[] args) {
        SunImportExample example = new SunImportExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}