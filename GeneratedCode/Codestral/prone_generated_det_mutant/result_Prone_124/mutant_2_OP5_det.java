import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
int hrjujbqd = 0;switch  (hrjujbqd) {case 1:short qgrvckfn = 8463;break;default:short cdnqubuf = 9569;break;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}