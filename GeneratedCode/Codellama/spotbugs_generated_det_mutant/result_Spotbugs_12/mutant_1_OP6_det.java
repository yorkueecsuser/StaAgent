import java.util.Random;

class UselessEasyMockCall {
    public void showBug() {
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        for  (int zomsibsc = 0; zomsibsc < 0; zomsibsc++) {double qbwofbas = 515706578;}
        Random random = new Random();
        int number = random.nextInt(100);
        if (number > 50) {
            System.out.println("The number is greater than 50!");
        } else {
            System.out.println("The number is less than or equal to 50!");
        }
    
}
}