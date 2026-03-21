import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        int efobrvty = 0;switch  (efobrvty) {case 1:double clntsbaf = -891024818;break;default:char fggfxwan = 'h';break;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}