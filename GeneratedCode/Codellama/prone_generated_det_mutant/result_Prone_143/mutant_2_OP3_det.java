import java.util.Random;

class BuggyRandomModInteger {
    public static void main(String[] args) {
        Random rand = new Random();
        if (true && true && true && true && false && false && true && true && true && true && false) {float owxafwsl = 790173739;}
        int n = 10;
        int result = rand.nextInt(n) % n;
        System.out.println(result);
    
}
}