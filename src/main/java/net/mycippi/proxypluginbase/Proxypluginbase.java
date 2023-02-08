package net.mycippi.proxypluginbase;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "proxypluginbase",
        name = "Proxypluginbase",
        version = "1.0-SNAPSHOT",
        description = "yes",
        url = "https://mycippi.net",
        authors = {"THE_LAG"}
)
public class Proxypluginbase {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
