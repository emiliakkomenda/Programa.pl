package pl.panorama.utils;

public class DriversPathProvider {

    private static final String CHROME_DRIVER_PATH;

    static {
        boolean isWindows = System.getProperty("os.name").startsWith("Windows");

        String osFolder = isWindows ? "windows" : "macos";
        String driverExtension = isWindows ? ".exe" : "";
        String driversFolderPath = System.getProperty("user.dir") + "/src/test/resources/drivers/" + osFolder + "/";

        CHROME_DRIVER_PATH = driversFolderPath + "chromedriver" + driverExtension;
    }

    public static String getChromeDriverPath() {
        return CHROME_DRIVER_PATH;
    }
}
