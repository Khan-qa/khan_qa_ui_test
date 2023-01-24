package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface UserConfig extends Config {

    @DefaultValue("Khan Qa")
    String username();

    @DefaultValue("TestPassword2023")
    String password();

}
