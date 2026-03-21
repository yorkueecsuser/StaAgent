import java.util.ArrayList;

class TQBugDemo {
    public static void main(String[] args) {
        // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        int jzjktwlq = 0;switch  (jzjktwlq) {case 1:float bzxsdosf = -124797963;break;default:boolean lgibkpts = false;break;}
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        String[] arr = new String[2];
        arr[0] = list.get(0);
        arr[1] = list.get(1);
        System.out.println(arr[0] + " " + arr[1]);
    
}
}