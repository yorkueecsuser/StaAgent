import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        int bcizqkhg = 0;switch  (bcizqkhg) {case 1:char dmxgauym = 'k';break;default:String eanwbcgv = "ouczhgkp";break;}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}