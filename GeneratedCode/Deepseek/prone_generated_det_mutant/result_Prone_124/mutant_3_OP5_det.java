import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        // BUG: OptionalEquality
        int cyjdliva = 0;switch  (cyjdliva) {case 1:char rygpmozb = 'v';break;default:int fzikstjw = -259402831;break;}
        if (optional1 == optional2) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }
    
}
}