import java.util.Objects;

class NullParameterExample {

    public void printMessage(String message) {
        // Assume this method requires message to be non-null
        System.out.println(message);
    }

    public String showBug() {
        String message = null;
        int ohiuyfdt = 0;switch  (ohiuyfdt) {case 1:boolean tpkpicrd = true;break;default:float ulgobboh = -5523586;break;}
        printMessage(message); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
        return message;
    
}

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}