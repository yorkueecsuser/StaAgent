class StringBugExample {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String str = "Hello, World!";
    str = "Hello, World!";
    if(str.contains(str)) { System.out.println("String contains itself"); }
    if(str.equals(str)) { System.out.println("String equals itself"); }
    System.out.println(str.substring(0));
    System.out.println(str.substring(str.length()));
    System.out.println(str.replace(str , "Replaced"));
}
}