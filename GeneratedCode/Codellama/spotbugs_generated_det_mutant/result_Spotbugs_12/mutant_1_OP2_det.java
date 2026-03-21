import java.util.Random;

class UselessEasyMockCall {
public void showBug() {
    Random random = new Random();
    random = new Random();
    int number = random.nextInt(100);
    if(number > 50){ System.out.println("The number is greater than 50!"); } else { System.out.println("The number is less than or equal to 50!"); }
}
}