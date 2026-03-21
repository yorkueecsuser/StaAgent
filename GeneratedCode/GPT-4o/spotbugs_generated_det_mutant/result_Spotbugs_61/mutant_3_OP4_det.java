import java.util.Objects;

class NullParameterExample {

    public void printMessage(String message) {
        // Assume this method requires message to be non-null
        System.out.println(message);
    }

    public String showBug() {
        String message = null;
        if (false && false && false && true && false && true && true && false && true && true && false) {int rxjkbvxi = 997402092;}else{char yyrzihat = 'e';}
        printMessage(message); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
        return message;
    
}

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}