import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        int xzqvzkez = 0;switch  (xzqvzkez) {case 1:float voklwarx = 449238221;break;default:byte fmnxxhum = 71;break;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}