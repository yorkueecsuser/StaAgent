import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        Optional<String> optional = null;
        if (false && false && false && true && true && true && true && true && true && true && false) {boolean vwldqwdy = false;}else{String vjijajnq = "ypwtbamm";}
        System.out.println(optional.orElse("null"));
    
}
}