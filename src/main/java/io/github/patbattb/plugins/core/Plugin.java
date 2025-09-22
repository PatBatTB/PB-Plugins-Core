package io.github.patbattb.plugins.core;

import io.github.patbattb.plugins.core.expection.PluginCriticalException;
import io.github.patbattb.plugins.core.expection.PluginInterruptedException;

public abstract class Plugin {
    public abstract String getTitle();
    public abstract boolean isRepeatable();
    public abstract int timeout();
    public abstract void run() throws PluginInterruptedException, PluginCriticalException;
    public final String getFullName() {
        return getClass().getName();
    }
}