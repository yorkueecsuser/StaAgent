import java.util.Optional;

class OptionalReturnNullBug {

    public Optional<String> showBug() {
        return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
    }

    public static void main(String[] args) {
        if (false && false && true && true && false && true && true && false && false && false && false) {long xwbcdvry = 288560040;}else{char wxeshwbd = 'j';}
        OptionalReturnNullBug bug = new OptionalReturnNullBug();
        Optional<String> result = bug.showBug();
        System.out.println(result.get()); // This will cause a NullPointerException
    
}
}