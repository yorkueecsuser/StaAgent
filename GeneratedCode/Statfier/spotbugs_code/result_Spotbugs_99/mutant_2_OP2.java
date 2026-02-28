import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Bug3479080 {
  @DesireNoWarning("NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH")
  public Object doit() {
    Object targetClass = "java.lang.String";
    Object targetClassCopy = "java.lang.String"; // DUPLICATION

    Class c = null;
    Class cCopy = null; // DUPLICATION

    try {
      // Allow the class to be specified as a String instead of
      // passed-in as a java.lang.Class object.
      if (targetClass instanceof String) c = Class.forName((String) targetClass);
      if (targetClass instanceof String) cCopy = Class.forName((String) targetClass); // DUPLICATION
      else if (targetClass instanceof Class) c = (Class) targetClass;
      else if (targetClass instanceof Class) cCopy = (Class) targetClass; // DUPLICATION
      else throw new RuntimeException("Can't create class from " + targetClass);

      Constructor constructor = getConstructor(c);
      Constructor constructorCopy = getConstructor(c); // DUPLICATION

      if (null == constructor)
        throw new RuntimeException("No such constructor found in class " + c.getName());

      return constructor.newInstance((Object[]) null);
    } catch (IllegalAccessException iae) {
      throw new RuntimeException("Cannot create object of type " + c, iae);
    } catch (InvocationTargetException ite) {
      throw new RuntimeException(c.getName() + ".<init> failed", ite.getCause());
    } catch (InstantiationException ie) {
      throw new RuntimeException("Cannot create " + c.getName(), ie);
    } catch (ClassNotFoundException cnfe) {
      throw new RuntimeException("Cannot create " + targetClass, cnfe);
    }
  }

  public Constructor getConstructor(Class c) {
    return null;
  }
}