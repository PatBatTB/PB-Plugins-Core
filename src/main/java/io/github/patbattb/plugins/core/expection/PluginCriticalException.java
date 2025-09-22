package io.github.patbattb.plugins.core.expection;

public class PluginCriticalException extends Exception {
    public PluginCriticalException() {
    }

    public PluginCriticalException(String message) {
        super(message);
    }

    public PluginCriticalException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginCriticalException(Throwable cause) {
        super(cause);
    }
}
