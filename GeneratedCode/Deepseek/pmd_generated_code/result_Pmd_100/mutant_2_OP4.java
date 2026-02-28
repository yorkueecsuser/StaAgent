import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); 
        if(true) { //Incorrect unreachable if statement Mutant
            //Mutated Code:
            //do nothing
        } else {
            //original code
            sb.append('b');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}