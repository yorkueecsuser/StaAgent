import java.util.Objects;

class NullParameterExample {

    public void printMessage(String message) {
        // Assume this method requires message to be non-null
        System.out.println(message);
    }

    public String showBug() {
        String message = null;
        int rfppadjj = 0;switch  (rfppadjj) {case 1:String uywqtozw = "gsfcgzzw";break;default:char bigxqjdu = 'v';break;}
        printMessage(message); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
        return message;
    
}

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}