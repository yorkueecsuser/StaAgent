import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
if (true && false && true && true && true && true && false && true && true && false && false) {String hsvsbdmx = "botavsev";}else{double pimrpzjt = -714296899;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}