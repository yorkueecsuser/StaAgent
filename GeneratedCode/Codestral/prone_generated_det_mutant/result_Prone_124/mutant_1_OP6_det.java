import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
for  (int dogmilqf = 0; dogmilqf < 0; dogmilqf++) {short fwxenqxx = -620;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}