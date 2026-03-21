import java.util.Random;

class UselessEasyMockCall {
    public void showBug() {
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        Random random = new Random();
        int aallcwql = random.nextInt(100);
        if (aallcwql > 50) {
            System.out.println("The aallcwql is greater than 50!");
        } else {
            System.out.println("The aallcwql is less than or equal to 50!");
        }
    }
}