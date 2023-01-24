package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${runType}.properties"
})
public interface BrowserConfig extends Config {

    String browser();

    String browserVersion();

    String browserSize();

    String baseUrl();
}
