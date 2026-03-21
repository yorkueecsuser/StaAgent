import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        int dcwzlyhg = 0;switch  (dcwzlyhg) {case 1:String vqdthpbm = "bnsfdajf";break;default:boolean wncalbkh = true;break;}
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}