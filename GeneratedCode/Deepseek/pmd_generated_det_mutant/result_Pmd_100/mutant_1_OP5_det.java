import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        int ktixfbtq = 0;switch  (ktixfbtq) {case 1:char ppygtiaz = 'q';break;default:double tcrfjsef = 986058298;break;}
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}