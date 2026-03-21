import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        int nesutosz = 0;switch  (nesutosz) {case 1:int blguiojh = 804309421;break;default:short fguibgbc = 8042;break;}
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    
}

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}