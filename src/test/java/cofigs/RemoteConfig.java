package cofigs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/remote.properties"
})
public interface RemoteConfig extends Config {

    @Key("remoteUrl")
    String remote();

    String remoteVideoUrl();
}
