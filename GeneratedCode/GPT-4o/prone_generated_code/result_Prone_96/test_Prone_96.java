import org.junit.Test;

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
        service.performService();
    }
}

public class AbstractServiceTest {

    @Test
    public void testShowBug() {
        AbstractService service = new ConcreteService();
        ServiceDemo demo = new ServiceDemo(service);
        demo.showBug(); // TRIGGER BUG: JavaxInjectOnAbstractMethod
    }
}