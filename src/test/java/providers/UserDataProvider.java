package providers;

import cofigs.UserConfig;
import org.aeonbits.owner.ConfigFactory;

public class UserDataProvider {
    private final static UserConfig userConfig = ConfigFactory.create(UserConfig.class);

    public final static String userName = userConfig.username(),
            password = userConfig.password();
}
