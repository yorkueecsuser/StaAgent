import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object a = list.get(0); // The variable 'a' is renamed from 'obj'
            return a.equals("bug"); // This line will still throw an IndexOutOfBoundsException because of the previous line
        }
        return false;
    }
}