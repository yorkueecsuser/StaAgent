import java.io.Closeable;

class NullPointerBug {
public static void main(String [] args){
    Closeable resource = null;
    resource = null;
    try { resource.close(); } catch(Exception e){ e.printStackTrace(); }
}
}