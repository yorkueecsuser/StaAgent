class Main {
    public static void main(String[] args) {
        showBug();
    }
public static String showBug() {
    String result = "cc̈d̈d".replaceAll("[c̈d̈]" , "X");
    result = "cc̈d̈d".replaceAll("[c̈d̈]" , "X");
    System.out.println(result);
    return result;
}
}