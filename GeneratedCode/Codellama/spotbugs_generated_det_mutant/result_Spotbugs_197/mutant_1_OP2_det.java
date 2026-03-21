import java.security.PermissionCollection;

class CustomClassLoader extends ClassLoader {
@ Override public PermissionCollection getPermissions(CodeSource codesource){
    PermissionCollection permissions = new PermissionCollection() { @ Override public void add(Permission permission){ } };
    permissions = new PermissionCollection() { @ Override public void add(Permission permission){ } };
    permissions.add(new RuntimePermission("customPermission"));
    return permissions;
}

    public static void main(String[] args) {
        ClassLoader loader = new CustomClassLoader();
        try {
            loader.loadClass("CustomClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class CustomClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}