import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
        switch(getRandomNumber()) {
            case 1:
                System.out.println("Random number is 1");
                break;
            case 2:
                System.out.println("Random number is 2");
                break;
            default:
                System.out.println("Random number is not 1 or 2");
                break;
        }
    }

    private static int getRandomNumber() {
        return Math.random() < 0.5? 1 : 2;
    }
}