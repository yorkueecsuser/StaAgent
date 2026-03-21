import java.util.Optional;

class OptionalReturnNullBug {

    public Optional<String> showBug() {
        return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
    }

    public static void main(String[] args) {
        for  (int rlbhhcxj = 0; rlbhhcxj < 0; rlbhhcxj++) {String rdhntnxq = "uoqxrcux";}
        OptionalReturnNullBug bug = new OptionalReturnNullBug();
        Optional<String> result = bug.showBug();
        System.out.println(result.get()); // This will cause a NullPointerException
    
}
}