package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/user.properties"
})
public interface UserConfig extends Config {

    String username();

    String password();
}
