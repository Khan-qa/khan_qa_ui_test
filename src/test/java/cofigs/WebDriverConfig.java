package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/local.properties",
        "classpath:properties/remote.properties"
})
public interface WebDriverConfig extends Config {

    String browser();

    String browserVersion();

    String browserSize();

    @Key("remoteUrl")
    String remote();

    String baseUrl();

    String remoteVideoUrl();

}
