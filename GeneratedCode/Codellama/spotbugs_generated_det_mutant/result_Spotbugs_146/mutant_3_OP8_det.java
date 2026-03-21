import java.util.ArrayList;

class TQBugDemo {
    public static void main(String[] args) {
        // BUG: TQ: Value that might ctsmjeprvy a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        String[] tsmjeprv = new String[2];
        tsmjeprv[0] = list.get(0);
        tsmjeprv[1] = list.get(1);
        System.out.println(tsmjeprv[0] + " " + tsmjeprv[1]);
    }
}