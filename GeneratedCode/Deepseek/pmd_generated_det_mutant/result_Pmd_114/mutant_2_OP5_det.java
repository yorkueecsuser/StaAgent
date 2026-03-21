import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        int opgtvksu = 0;switch  (opgtvksu) {case 1:int npksriup = 563434842;break;default:double uxvgrxos = -721227960;break;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}