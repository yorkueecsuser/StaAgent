import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        int ehrticvb = 0;switch  (ehrticvb) {case 1:String wnicrieu = "albldqfw";break;default:int zsdsqral = -391566650;break;}
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
    
}
}