import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        int vazahqoy = 0;switch  (vazahqoy) {case 1:boolean nhbaingp = true;break;default:String fsqdzmff = "hvnoqqnf";break;}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}