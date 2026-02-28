import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());
    }
}

// Renamed variable "sb" to "strBuffer"
StringBuffer strBuffer = new StringBuffer();
strBuffer.append("Hello");
strBuffer.append(", ");
strBuffer.append("World");
strBuffer.append("!");
System.out.println(strBuffer.toString());