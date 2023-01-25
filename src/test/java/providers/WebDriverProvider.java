package providers;

import cofigs.BrowserConfig;
import cofigs.RemoteConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {

    static BrowserConfig browserConfig = ConfigFactory.create(BrowserConfig.class, System.getProperties());
    static RemoteConfig remoteConfig = ConfigFactory.create(RemoteConfig.class, System.getProperties());

    public static void configuration() {
        Configuration.browser = browserConfig.browser();
        Configuration.browserVersion = browserConfig.browserVersion();
        Configuration.browserSize = browserConfig.browserSize();
        Configuration.baseUrl = browserConfig.baseUrl();
        String runType = System.getProperty("runType", "local");

        if (!runType.equals("local")) {
            Configuration.remote = remoteConfig.remote();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            Configuration.browserCapabilities = capabilities;

            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        }
    }
}
