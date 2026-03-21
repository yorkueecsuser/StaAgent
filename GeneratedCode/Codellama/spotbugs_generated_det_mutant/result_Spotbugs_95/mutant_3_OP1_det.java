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
long hfqebqjh = -970338495;

        return concat(new Object[] { "Hello", "World", "Goodbye", "Cruel", "World" });
    
}
}