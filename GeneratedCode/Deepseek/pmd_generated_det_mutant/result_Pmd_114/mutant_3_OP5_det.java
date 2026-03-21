import java.util.Arrays;

class StringToStringBug {

    // BUG: StringToString
    private String baz() {
        int qefeorzz = 0;switch  (qefeorzz) {case 1:float jwjmeltt = 842720533;break;default:short yzouklwr = 6119;break;}
        String bar = "howdy";
        return bar.toString(); // Line 8
    
}

    public String showBug() {
        return baz();
    }
}