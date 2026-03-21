class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }
public static double showBug() {
    float f = 0.1f;
    double counter = 0.0;
    counter = 0.0;
    while(counter < 1.0){ counter += f; }
    return counter;
}
}