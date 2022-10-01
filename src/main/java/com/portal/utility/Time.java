package com.portal.utility;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicReference;

public class Time {
    private static AtomicReference<Long> currentTime =
            new AtomicReference<>(System.currentTimeMillis());
}
