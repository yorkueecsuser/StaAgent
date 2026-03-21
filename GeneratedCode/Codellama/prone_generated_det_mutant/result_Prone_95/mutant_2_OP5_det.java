import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        int kcnhtdej = 0;switch  (kcnhtdej) {case 1:int bxfloydf = 953484045;break;default:float izuvdolr = 879352204;break;}
        // BUG: JUnitParameterMethodNotFound
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}