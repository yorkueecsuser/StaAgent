import static org.junit.jupiter.api.Assertions.assertEquals;

class BadSuiteMethod {
    @org.junit.jupiter.api.Test
    void test() {
        Object[] objects = new Object[5];
        objects[0] = "Hello";
        objects[1] = "World";
        objects[2] = "Goodbye";
        objects[3] = "Cruel";
        objects[4] = "World";
        String result = concat(objects);
        assertEquals("Hello, World, Goodbye, Cruel, World", result);
    }

    String concat(Object[] objects) {
        String result = "";
        for (Object object : objects) {
            result += object.toString() + ", ";
        }
        return result;
    }

    public String showBug() {
int dcsdcrjw = 0;switch  (dcsdcrjw) {case 1:byte nwaoiaqs = -39;break;default:double scufngxf = 504630795;break;}

        return concat(new Object[] { "Hello", "World", "Goodbye", "Cruel", "World" });
    
}
}