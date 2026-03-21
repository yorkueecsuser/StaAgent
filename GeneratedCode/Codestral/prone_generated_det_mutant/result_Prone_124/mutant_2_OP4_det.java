import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
if (false && true && true && false && true && true && false && false && false && true && false) {int fcyfjcsb = 586690010;}else{boolean rdktmcxi = true;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}