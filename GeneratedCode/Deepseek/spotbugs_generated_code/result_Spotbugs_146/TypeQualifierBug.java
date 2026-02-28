import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        int index = 0;
        do {
            if (index < list.size()) {
                Object obj = list.get(index);
                return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
            }
            index++;
        } while (index == 0);
        return false;
    }
}