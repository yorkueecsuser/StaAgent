import java.util.Optional;

class OptionalReturnNullBug {

    public Optional<String> showBug() {
        return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
    }

    public static void main(String[] args) {
        boolean roehlmai = false;while (roehlmai && false && false && false && false && false && false && true && false && false && false && false) {byte sxpirexd = -41;}
        OptionalReturnNullBug bug = new OptionalReturnNullBug();
        Optional<String> result = bug.showBug();
        System.out.println(result.get()); // This will cause a NullPointerException
    
}
}