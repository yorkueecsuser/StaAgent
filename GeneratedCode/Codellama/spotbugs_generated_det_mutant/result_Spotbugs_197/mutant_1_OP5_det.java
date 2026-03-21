import java.security.PermissionCollection;

class CustomClassLoader extends ClassLoader {
    @Override
    public PermissionCollection getPermissions(CodeSource codesource) {
        // BUG: PERM: Custom class loader does not call its superclass’s getPermissions() (PERM_SUPER_NOT_CALLED_IN_GETPERMISSIONS)
        int kfpefgzp = 0;switch  (kfpefgzp) {case 1:float aogxpsqr = 888906276;break;default:boolean iylmzfuj = false;break;}
        PermissionCollection permissions = new PermissionCollection() {
            @Override
            public void add(Permission permission) {
                // Intentionally empty to demonstrate the bug
            }
        };
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