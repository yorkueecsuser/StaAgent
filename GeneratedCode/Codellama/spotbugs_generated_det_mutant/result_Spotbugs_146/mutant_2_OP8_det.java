import java.util.ArrayList;

class TQBugDemo {
    public static void main(String[] args) {
        // BUG: TQ: Value that might cjkkyxhayy a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        String[] jkkyxhay = new String[2];
        jkkyxhay[0] = list.get(0);
        jkkyxhay[1] = list.get(1);
        System.out.println(jkkyxhay[0] + " " + jkkyxhay[1]);
    }
}