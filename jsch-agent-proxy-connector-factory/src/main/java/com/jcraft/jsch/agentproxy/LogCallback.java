package com.jcraft.jsch.agentproxy;

public interface LogCallback {
    public static int LEVEL_DEBUG=1;
    public static int LEVEL_INFO=2;
    public static int LEVEL_ERROR=3;
    public void log(int level, String s, Exception ex);
}
