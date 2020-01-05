package com.xy.calendarfunction;

import java.io.Serializable;

/**
 * 日历实体类，添加的参数在获取日历实体集合的时候设置
 */
public class DateEntity extends BaseDateEntity implements Serializable {

    /**
     * 日期
     */
    public int date;

    /**
     * 星期
     */
    public int weekDay;

    /**
     * 是否为当前日期
     */
    public boolean isNowDate;

    /**
     * 是否为本月日期
     */
    public boolean isSelfMonthDate;

    /**
     * 是否有记录
     */
    public boolean hasRecord = false;

    public DateEntity(int year, int month, int day) {
        super(year, month, day);
    }
}
