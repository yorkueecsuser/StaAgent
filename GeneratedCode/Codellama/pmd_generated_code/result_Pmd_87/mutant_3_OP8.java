import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }
}

/* Renaming: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z]. */

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }
}

/* Mutant 1: Renamed variable "urls" to "z" */

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] z = classLoader.getURLs();
        for (URL url : z) {
            System.out.println(url.getFile());
        }
    }
}

/* Mutant 2: Renamed variable "url" to "y" */

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL y : urls) {
            System.out.println(y.getFile());
        }
    }
}

/* Mutant 3: Renamed variable "classLoader" to "x" */

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader x = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = x.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }
}