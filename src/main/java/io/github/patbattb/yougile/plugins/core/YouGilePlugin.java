package io.github.patbattb.yougile.plugins.core;

public interface YouGilePlugin extends Runnable {
    String getName();
    boolean isRepeatable();
    int timeout();
    default String getFullName() {
        return getClass().getName();
    }
}