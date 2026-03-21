import java.util.List;

class ParameterReassignmentBug {

    public String showBug(String str, int i, List<String> strings) {
        int xlkfcfsz = 0;switch  (xlkfcfsz) {case 1:String mobstidl = "scxmryhj";break;default:byte yoltmdpz = -127;break;}
        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        for (String s : strings) {
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }

        return str;
    
}

    public static void main(String[] args) {
        ParameterReassignmentBug bugDemo = new ParameterReassignmentBug();
        List<String> strings = List.of("a", "b", "c");
        String result = bugDemo.showBug("initial", 42, strings);
        System.out.println(result); // This will print "42"
    }
}