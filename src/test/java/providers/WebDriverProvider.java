package providers;

import cofigs.WebDriverConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configuration() {

        Configuration.browser = WebDriverProvider.config.browser();
        Configuration.browserVersion = WebDriverProvider.config.browserVersion();
        Configuration.browserSize = WebDriverProvider.config.browserSize();
        Configuration.baseUrl = WebDriverProvider.config.baseUrl();
        String configSource = WebDriverProvider.config.remote();

        if (configSource != null) {
            Configuration.remote = WebDriverProvider.config.remote();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            Configuration.browserCapabilities = capabilities;

            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        }
    }
}
