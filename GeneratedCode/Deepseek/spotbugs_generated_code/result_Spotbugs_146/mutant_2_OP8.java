import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // Original bug
            Object a = obj; // Mutant: Renamed 'obj' to 'a'
            return a.equals("bug"); // This line will still throw an IndexOutOfBoundsException because of the original bug
        }
        return false;
    }
}