package ir.h76.javaproblems.essentials;

public class JavaSystemProperties {
  String userDir = System.getProperty("user.dir");
  String userHome = System.getProperty("user.home");
  String userName = System.getProperty("user.name");
  String fileSpe = System.getProperty("file.separator");
  String javaClassPath = System.getProperty("java.class.path");
  String javaHome = System.getProperty("java.home");
  String javaVendor = System.getProperty("java.vendor");
  String javaVendorURL = System.getProperty("java.vendor.url");
  String javaVersion = System.getProperty("java.version");
  String javaSep = System.getProperty("line.separator");
  String osArch = System.getProperty("os.arch");
  String osName = System.getProperty("os.name");
  String osVer = System.getProperty("os.version");
  String pathSep = System.getProperty("path.separator");


  public void print() {
    System.out.println("- Project Directory: " + userDir);
    System.out.println("- User Home Directory: " + userHome);
    System.out.println("- User Name: " + userName);
    System.out.println("- Character Separator on this os: " + fileSpe);
    System.out.println("- Path to JAR and class files: " + javaClassPath);
    System.out.println("- Installation directory for JRE: " + javaHome);
    System.out.println("- JRE vendor name: " + javaVendor);
    System.out.println("- JRE vendor URL: " + javaVendorURL);
    System.out.println("- JRE version number: " + javaVersion);
    System.out.println("- Sequence used by operating system to separate lines in text files: " + javaSep);
    System.out.println("- Operating system architecture: " + osArch);
    System.out.println("- Operating system name: " + osName);
    System.out.println("- Operating system version: " + osVer);
    System.out.println("- Path separator character used in java.class.path: " + pathSep);
  }
}
