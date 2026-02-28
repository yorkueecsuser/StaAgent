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

// Mutant 1: Duplicate sb.append("Hello")
StringBuffer sb = new StringBuffer();
sb.append("Hello");
sb.append("Hello");
sb.append(", ");
sb.append("World");
sb.append("!");
System.out.println(sb.toString());

// Mutant 2: Duplicate sb.append(", ")
StringBuffer sb = new StringBuffer();
sb.append("Hello");
sb.append(", ");
sb.append(", ");
sb.append("World");
sb.append("!");
System.out.println(sb.toString());

// Mutant 3: Duplicate sb.append("World")
StringBuffer sb = new StringBuffer();
sb.append("Hello");
sb.append(", ");
sb.append("World");
sb.append("World");
sb.append("!");
System.out.println(sb.toString());

// Mutant 4: Duplicate sb.append("!")
StringBuffer sb = new StringBuffer();
sb.append("Hello");
sb.append(", ");
sb.append("World");
sb.append("!");
sb.append("!");
System.out.println(sb.toString());