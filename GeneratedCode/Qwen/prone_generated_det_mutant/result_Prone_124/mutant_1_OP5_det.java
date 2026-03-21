import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
int begdvter = 0;switch  (begdvter) {case 1:String cmehewox = "pnzyqbjm";break;default:String uztexvhp = "qbubcrel";break;}

        return opt1 == opt2; // BUG: OptionalEquality
    
}

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}