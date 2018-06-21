package com.cnpc.schedule.builder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason on 18-5-2.
 */
public class ResultBuilder {

    private static final Map<String, Object> successCodeBean;

    public ResultBuilder() {
    }

    public static Map buildSuccessCode() {
        return successCodeBean;
    }

    public static Map buildSuccess(Object data) {
        HashMap map = new HashMap(2);
        map.put("success", Boolean.valueOf(true));
        map.put("data", data);
        return map;
    }

    public static Map buildSuccess(Object data, String version) {
        HashMap map = new HashMap(2);
        map.put("success", Boolean.valueOf(true));
        map.put("data", data);
        map.put("version", version);
        return map;
    }

    public static Map buildError(String errMessage) {
        HashMap map = new HashMap(2);
        map.put("success", Boolean.valueOf(false));
        map.put("errorMessage", errMessage);
        return map;
    }

    static {
        HashMap map = new HashMap(1);
        map.put("success", Boolean.valueOf(true));
        successCodeBean = Collections.unmodifiableMap(map);
    }
}
