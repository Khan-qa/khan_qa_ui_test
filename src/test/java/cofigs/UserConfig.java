package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface UserConfig extends Config {

    @Config.Key("username")
    @Config.DefaultValue("Khan Qa")
    String username();

    @Config.Key("password")
    @Config.DefaultValue("TestPassword2023")
    String password();

}
