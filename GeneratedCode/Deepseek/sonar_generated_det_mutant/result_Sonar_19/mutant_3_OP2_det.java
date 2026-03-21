class BugDemo {
public static void showBug() {
    int [] array = new int [ 5 ];
    array = new int [ 5 ];
    System.out.println(array [ 5 ]);
}

    public static void main(String[] args) {
        showBug();
    }
}