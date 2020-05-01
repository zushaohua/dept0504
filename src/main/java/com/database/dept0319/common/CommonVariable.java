package com.database.dept0319.common;

public class CommonVariable {
    public static Integer caplen=0;
  //  public static long packettime=0;
    public static  boolean  downlable=false;
    public static Integer downloadtime=0;

    public static Integer getCaplen() {
        return caplen;
    }

    public static void setCaplen(Integer caplen) {
        CommonVariable.caplen = caplen;
    }

    public static boolean isDownlable() {
        return downlable;
    }

    public static void setDownlable(boolean downlable) {
        CommonVariable.downlable = downlable;
    }
}
