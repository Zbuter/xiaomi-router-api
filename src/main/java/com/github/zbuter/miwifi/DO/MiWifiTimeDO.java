package com.github.zbuter.miwifi.DO;

import lombok.Data;

/**
 * xiaomi-route-api
 * <br />
 *
 * @author: Jiashun Zhang
 * @since: 2021-08-14
 */
@Data
public class MiWifiTimeDO extends MiWifiBaseDO {
    Time time;
    @Data
    public static class Time{
        int day;
        int hour;
        int index;
        int min;
        int month;
        int sec;
        String timezone;
        int year;
    }
}
