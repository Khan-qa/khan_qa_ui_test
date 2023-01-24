package cofigs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("100.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remoteUrl")
    String remote();

    @DefaultValue("https://ru.wikipedia.org")
    String baseUrl();

}
