import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());
    }
}

// Mutant code
boolean condition = getCondition();
if (condition) {
    int value = getValue();
    switch(value) {
        case 1: /* code */ break;
    }
}