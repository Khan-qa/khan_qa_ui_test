package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface UserConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

}
