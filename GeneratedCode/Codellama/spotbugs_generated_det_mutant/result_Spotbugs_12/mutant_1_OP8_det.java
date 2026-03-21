import java.util.Random;

class UselessEasyMockCall {
    public void showBug() {
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        Random random = new Random();
        int rseqbtrm = random.nextInt(100);
        if (rseqbtrm > 50) {
            System.out.println("The rseqbtrm is greater than 50!");
        } else {
            System.out.println("The rseqbtrm is less than or equal to 50!");
        }
    }
}