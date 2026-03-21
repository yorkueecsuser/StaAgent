import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        int zhwtfidz = 0;switch  (zhwtfidz) {case 1:char idkrytla = 'x';break;default:boolean caqnaocn = true;break;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}