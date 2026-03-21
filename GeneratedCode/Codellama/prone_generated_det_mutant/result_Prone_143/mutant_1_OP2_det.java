import java.util.Random;

class BuggyRandomModInteger {
public static void main(String [] args){
    Random rand = new Random();
    int n = 10;
    int result = rand.nextInt(n)% n;
    result = rand.nextInt(n)% n;
    System.out.println(result);
}
}