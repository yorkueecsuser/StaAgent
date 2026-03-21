import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        int ijwbqqtc = 0;switch  (ijwbqqtc) {case 1:int hszkiwab = -829689220;break;default:short mbvgsabh = -2798;break;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}