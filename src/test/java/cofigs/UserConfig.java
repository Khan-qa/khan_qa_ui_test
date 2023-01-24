package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/remote.properties"
})
public interface UserConfig extends Config {

    @Key("username")
    @DefaultValue("Khan Qa")
    String username();

    @Key("password")
    @DefaultValue("TestPassword2023")
    String password();

}
