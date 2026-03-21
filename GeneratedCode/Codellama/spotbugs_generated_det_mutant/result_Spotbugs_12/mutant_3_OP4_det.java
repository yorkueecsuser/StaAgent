import java.util.Random;

class UselessEasyMockCall {
    public void showBug() {
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        if (false && true && false && false && true && true && true && true && false && false && false) {int rjizowdw = 985560838;}else{String iqfdodzi = "wtmgjngn";}
        Random random = new Random();
        int number = random.nextInt(100);
        if (number > 50) {
            System.out.println("The number is greater than 50!");
        } else {
            System.out.println("The number is less than or equal to 50!");
        }
    
}
}