import java.util.Optional;

class OptionalReturnNullBug {

    public Optional<String> showBug() {
        return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
    }

    public static void main(String[] args) {
        int zblyhhmp = 0;switch  (zblyhhmp) {case 1:float bwsmywen = 146950581;break;default:byte xcrqfsho = -39;break;}
        OptionalReturnNullBug bug = new OptionalReturnNullBug();
        Optional<String> result = bug.showBug();
        System.out.println(result.get()); // This will cause a NullPointerException
    
}
}