import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

class ResourceLeakExample {
public String showBug() {
    FileInputStream fis = null;
    fis = null;
    FileOutputStream fos = null;
    try { fis = new FileInputStream(new File("input.txt")); fos = new FileOutputStream(new File("output.txt")); fos.write(fis.read()); return "Write successful"; } catch(IOException e){ return "Exception occurred: " + e.getMessage(); } finally { try { if(fis != null)fis.close(); } catch(IOException e){ } try { if(fos != null)fos.close(); } catch(IOException e){ } }
}
}