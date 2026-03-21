import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        if (false && true && true && true && true && true && false && true && true && true && false) {double hsimeyte = 850722332;}else{short moygcdya = -388;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}