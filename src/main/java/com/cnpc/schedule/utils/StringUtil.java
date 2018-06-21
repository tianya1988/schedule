package com.cnpc.schedule.utils;

import java.util.UUID;

/**
 * Created by jason on 18-5-2.
 */
public class StringUtil {
    private StringUtil() {
    }

    public static String generateUuid() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-", "");
    }
}
