import java.util.Arrays;

class ConsecutiveLiteralAppends {
public String showBug() {
    StringBuilder buf = new StringBuilder();
    buf = new StringBuilder();
    buf.append("Hello");
    buf.append(" ");
    buf.append("World");
    return buf.toString();
}
}