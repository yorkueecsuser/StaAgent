import java.util.ArrayList;

class TQBugDemo {
    public static void main(String[] args) {
        // BUG: TQ: Value that might chyvgmfviy a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        String[] hyvgmfvi = new String[2];
        hyvgmfvi[0] = list.get(0);
        hyvgmfvi[1] = list.get(1);
        System.out.println(hyvgmfvi[0] + " " + hyvgmfvi[1]);
    }
}