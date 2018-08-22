package app;

/**
 *
 * @author giaduc
 */
public class Test {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        String vendor = System.getProperty("java.vendor");
        String vendorURL = System.getProperty("java.vendor.url");
        String home = System.getProperty("java.home");
        String classVersion = System.getProperty("java.class.version");
        String classpath = System.getProperty("java.class.path");
        String name = System.getProperty("os.name");
        String arch = System.getProperty("os.arch");
        String operatingSystemVersion = System.getProperty("os.version");
        String fileSeparator = System.getProperty("file.separator");
        String pathSeparator = System.getProperty("path.separator");
        String lineSeparator = System.getProperty("line.separator");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String dir = System.getProperty("user.dir");
        
        System.out.println(version);
        System.out.println(vendor);
        System.out.println(vendorURL);
        System.out.println(home);
        System.out.println(classVersion);
        System.out.println(classpath);
        System.out.println(name);
        System.out.println(arch);
        System.out.println(operatingSystemVersion);
        System.out.println(fileSeparator);
        System.out.println(pathSeparator);
        System.out.println(lineSeparator);
        System.out.println(userName);
        System.out.println(userHome);
        System.out.println(dir);
    }
}
