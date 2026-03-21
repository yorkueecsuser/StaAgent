import java.util.Optional;

class OptionalReturnNullBug {

    public Optional<String> showBug() {
        return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
    }

    public static void main(String[] args) {
        boolean mlvmnxxq = false;while (mlvmnxxq && true && false && false && false && false && true && false && false && false && true && false) {byte wtqdgzjz = -19;}
        OptionalReturnNullBug bug = new OptionalReturnNullBug();
        Optional<String> result = bug.showBug();
        System.out.println(result.get()); // This will cause a NullPointerException
    
}
}