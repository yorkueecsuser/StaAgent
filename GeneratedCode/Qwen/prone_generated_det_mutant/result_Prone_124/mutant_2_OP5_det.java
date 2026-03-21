import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
int iwasvnzf = 0;switch  (iwasvnzf) {case 1:boolean urhuglgb = true;break;default:float rsohfvzj = 987294339;break;}

        return opt1 == opt2; // BUG: OptionalEquality
    
}

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}