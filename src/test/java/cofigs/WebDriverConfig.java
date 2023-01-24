package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remote();

    @Key("baseUrl")
    String baseUrl();

    @Key("remoteVideoUrl")
    String remoteVideoUrl();

}
