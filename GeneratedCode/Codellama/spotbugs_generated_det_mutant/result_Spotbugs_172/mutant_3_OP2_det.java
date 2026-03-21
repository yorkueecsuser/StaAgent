import java.security.AccessController;

class ClassLoaderBug {
public void showBug() {
    ClassLoader classLoader = new URLClassLoader(new URL [] { new URL("https://example.com")});
    classLoader = new URLClassLoader(new URL [] { new URL("https://example.com")});
    classLoader.loadClass("java.lang.String");
}
}