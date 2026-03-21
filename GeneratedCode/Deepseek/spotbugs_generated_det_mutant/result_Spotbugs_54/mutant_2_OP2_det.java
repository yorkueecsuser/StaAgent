// BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)

class Main {
    public static void main(String[] args) {
        showBug();
    }
public static int showBug() {
    String str1 = "Hello";
    str1 = "Hello";
    String str2 = "World";
    int result = str1.compareTo(str2);
    if(result == 1){ System.out.println("Str1 is greater."); } else if(result == - 1){ System.out.println("Str2 is greater."); } else { System.out.println("Both strings are equal."); }
    return result;
}
}