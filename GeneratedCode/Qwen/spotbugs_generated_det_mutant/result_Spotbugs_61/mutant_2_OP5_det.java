import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        int dlpjmnqk = 0;switch  (dlpjmnqk) {case 1:short tvtrclpq = 4914;break;default:char iwsflvab = 'w';break;}
        // This method expects a non-null parameter but we pass null
        return Objects.requireNonNull(input).toUpperCase(); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void main(String[] args) {
        NullParameterDemo demo = new NullParameterDemo();
        try {
            System.out.println(demo.showBug(null));
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}