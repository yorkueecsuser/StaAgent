import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        int alyecusz = 0;switch  (alyecusz) {case 1:double dfkvedeb = 707655706;break;default:double daftcaiz = 289537373;break;}
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}