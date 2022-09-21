package com.portal.utility;

import java.text.SimpleDateFormat;

public class Time {
    public class ThreadLocalExample {
        public ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
            @Override
            protected SimpleDateFormat initialValue() {
                return new SimpleDateFormat("YYYY-MM-dd");
            }
        };
    }

}
