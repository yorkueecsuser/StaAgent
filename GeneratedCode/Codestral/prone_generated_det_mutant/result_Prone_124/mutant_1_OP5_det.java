import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
int yuegxxcu = 0;switch  (yuegxxcu) {case 1:String gamxmqwa = "tiwetqnp";break;default:short xeiwkhdt = 1292;break;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}