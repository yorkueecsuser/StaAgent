import java.lang.reflect.Proxy;

interface Calculator {
    int add(int a, int b);
}

class MockitoBugExample {
public int showBug() {
    Calculator calculator =(Calculator)Proxy.newProxyInstance(Calculator.class.getClassLoader() , new Class < ? > [] { Calculator.class } ,(proxy , method , args)-> { if(method.getName().equals("add")&&(int)args [ 0 ] == 3 &&(int)args [ 1 ] == 5){ return 10; } throw new UnsupportedOperationException(); });
    int result = calculator.add(3 , 5);
    result = calculator.add(3 , 5);
    System.out.println("Result: " + result);
    return result;
}

    public static void main(String[] args) {
        MockitoBugExample example = new MockitoBugExample();
        example.showBug();
    }
}