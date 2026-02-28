import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

class ImplicitSwitchFallThroughTest {
    @Test
    public void testImplicitSwitchFallThrough() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered 1");
            case 2: // TRIGGER BUG: ImplicitSwitchFallThrough
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}