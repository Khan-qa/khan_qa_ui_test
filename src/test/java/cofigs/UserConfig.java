package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:remote.properties"
})
public interface UserConfig extends Config {

    @Key("username")
    @DefaultValue("Khan Qa")
    String username();

    @Key("password")
    @DefaultValue("TestPassword2023")
    String password();

}
