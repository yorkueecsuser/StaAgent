import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
int zgxcvnnc = 0;switch  (zgxcvnnc) {case 1:String dblrfmqy = "pufhjdqm";break;default:byte mydnnbnj = -43;break;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}