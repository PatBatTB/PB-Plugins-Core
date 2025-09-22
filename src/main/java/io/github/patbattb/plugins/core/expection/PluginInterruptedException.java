package io.github.patbattb.plugins.core.expection;

public class PluginInterruptedException extends Exception {
    public PluginInterruptedException() {
    }

    public PluginInterruptedException(String message) {
        super(message);
    }

    public PluginInterruptedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginInterruptedException(Throwable cause) {
        super(cause);
    }
}
