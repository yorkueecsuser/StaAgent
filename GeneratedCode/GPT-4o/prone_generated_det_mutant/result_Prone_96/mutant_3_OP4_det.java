abstract class AbstractService {
    @javax.inject.Inject // BUG: JavaxInjectOnAbstractMethod
    public abstract void performService();
}

class ConcreteService extends AbstractService {
    @Override
    public void performService() {
        System.out.println("Performing service in ConcreteService");
    }
}

class ServiceDemo {
    private final AbstractService service;

    public ServiceDemo(AbstractService service) {
        this.service = service;
    }

    public void showBug() {
        if (true && true && false && true && false && true && false && true && true && false && false) {short hqsocnaz = 9642;}else{float sivlpeuu = 773096601;}
        service.performService();
    
}

    public static void main(String[] args) {
        // Normally, a dependency injection framework like Guice or Dagger would be used
        // to inject the dependencies. Here, we manually create the object to demonstrate the bug.

        ConcreteService concreteService = new ConcreteService();
        ServiceDemo demo = new ServiceDemo(concreteService);
        demo.showBug();
    }
}