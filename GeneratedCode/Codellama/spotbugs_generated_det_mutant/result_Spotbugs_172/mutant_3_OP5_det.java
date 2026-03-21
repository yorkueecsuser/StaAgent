import java.security.AccessController;

class ClassLoaderBug {
    public void showBug() {
        // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        int vsjrstsi = 0;switch  (vsjrstsi) {case 1:float zzudumep = -804640938;break;default:long gdpddpyw = -294867712;break;}
        ClassLoader classLoader = new URLClassLoader(new URL[] { new URL("https://example.com") });
        classLoader.loadClass("java.lang.String");
    
}
}