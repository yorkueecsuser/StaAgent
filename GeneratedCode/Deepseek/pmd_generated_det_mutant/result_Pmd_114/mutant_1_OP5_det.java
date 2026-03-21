import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        int mczxpwxw = 0;switch  (mczxpwxw) {case 1:boolean fdgdfqrm = false;break;default:float xlkhgmns = 159545776;break;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}