import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
for  (int fmlvtnci = 0; fmlvtnci < 0; fmlvtnci++) {double jshjnjqu = -207506308;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}