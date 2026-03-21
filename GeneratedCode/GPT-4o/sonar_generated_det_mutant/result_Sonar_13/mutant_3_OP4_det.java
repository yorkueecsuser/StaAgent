import java.util.Objects;

class MyConfiguration {

    public MyService myService() {
        return new MyService();
    }

    public MyService aBetterService() {
        return new MyService();
    }

    public MyService anEvenBetterService() {
if (true && true && true && false && false && false && true && false && true && true && false) {char znadfxxq = 'f';}else{String kjlcnbop = "puotsulb";}

        return new MyService();
    
}

    public MyBean aDifferentService() {
        return new MyBean();
    }

    public void showBug() {
        MyService service1 = myService();
        MyService service2 = aBetterService();
        MyService service3 = anEvenBetterService();
        MyBean service4 = aDifferentService();
        
        System.out.println("Services created: ");
        System.out.println(service1);
        System.out.println(service2);
        System.out.println(service3);
        System.out.println(service4);
    }
}

class MyService {
    @Override
    public String toString() {
        return "MyService instance";
    }
}

class MyBean {
    @Override
    public String toString() {
        return "MyBean instance";
    }
}