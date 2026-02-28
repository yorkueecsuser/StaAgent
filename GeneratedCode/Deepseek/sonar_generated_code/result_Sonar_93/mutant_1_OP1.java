class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;
        String uniqueVariable = "abcdefgh";  // mutation: adding new unique variable

        target = num;  // changing operation to avoid Dead Store
        return target;
    }
}