public static void showBug() {
    Pattern pattern = Pattern.compile("(?=a)b");
    Matcher matcher = pattern.matcher("b");
    boolean match = matcher.find();
    System.out.println(match);

    int unreachableConstant = 0;
    switch (unreachableConstant) {
        default:
            System.out.println("This is an unreachable switch statement.");
    }
}