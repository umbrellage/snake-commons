package cn.manba.time;

import cn.manba.constant.SnakeNumConstant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * SnakeTimeMemo
 *
 * @author Geweilang
 * @date 2021-07-04
 */
public final class SnakeTimeMemo {


    /**
     * 将毫秒转化成秒
     * <p>
     * @param milli 毫秒时间戳
     * @return 秒数
     */
    public static long milli2Second(long milli) {
        return milli / SnakeNumConstant.THOUSAND;
    }

    /**
     * 毫秒转LocalDateTime
     * <p>
     * @param milli 毫秒时间戳
     * @return LocalDateTime对象
     */
    public static LocalDateTime milli2DateTime(long milli) {
        Instant instant = Instant.ofEpochMilli(milli);

        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
