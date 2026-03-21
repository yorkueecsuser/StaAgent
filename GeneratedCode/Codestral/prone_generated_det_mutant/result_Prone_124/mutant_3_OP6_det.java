import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
for  (int suqvobtu = 0; suqvobtu < 0; suqvobtu++) {byte ftpctocc = -89;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}