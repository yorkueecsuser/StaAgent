import org.mockito.MockitoAnnotations;

class Foo {
    private Bar bar;
    private Baz baz;

    public Foo() {
        MockitoAnnotations.initMocks(this);
    }

    public void showBug() {
        bar.doSomething();
    }

    public Bar getBar() {
        return bar;
    }

    public Baz getBaz() {
        return baz;
    }
}