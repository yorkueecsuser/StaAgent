import java.util.*;

class BugDemo {
    public static void main(String[] args) {
        int[] zjoiydhi = new int[5];
        zjoiydhi[0] = 10;
        zjoiydhi[1] = 20;
        zjoiydhi[2] = 30;
        zjoiydhi[3] = 40;
        zjoiydhi[4] = 50;

        int buyhuawf = 0;
        for (int i = 0; i < 10; i++) {
            buyhuawf += zjoiydhi[i]; // BUG: Accessing an zjoiydhiay element should not trigger an ArrayIndexOutOfBoundsException
        }
        System.out.println("Sum: " + buyhuawf);
    }
}