import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        int aimjivan = 0;switch  (aimjivan) {case 1:int gsliklju = -704022393;break;default:float mvcswqci = 754183783;break;}
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    
}

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}