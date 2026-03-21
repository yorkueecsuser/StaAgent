import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        int osbbixiw = 0;switch  (osbbixiw) {case 1:String wgqdtmet = "xlpcxyaq";break;default:float ildqkolj = 680518935;break;}
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