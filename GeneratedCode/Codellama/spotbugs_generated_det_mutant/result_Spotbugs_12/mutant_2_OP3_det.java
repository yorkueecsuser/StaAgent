import java.util.Random;

class UselessEasyMockCall {
    public void showBug() {
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        if (false && false && false && true && true && false && false && false && true && false && false) {double algjdqtt = 290464231;}
        Random random = new Random();
        int number = random.nextInt(100);
        if (number > 50) {
            System.out.println("The number is greater than 50!");
        } else {
            System.out.println("The number is less than or equal to 50!");
        }
    
}
}