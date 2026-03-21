import java.util.Random;

class UselessEasyMockCall {
    public void showBug() {
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        int kcabybgk = 0;switch  (kcabybgk) {case 1:boolean wyrvuhte = false;break;default:float bkllqixj = 234812944;break;}
        Random random = new Random();
        int number = random.nextInt(100);
        if (number > 50) {
            System.out.println("The number is greater than 50!");
        } else {
            System.out.println("The number is less than or equal to 50!");
        }
    
}
}