package com.chatapp.threadripper.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {

    public static String formatDateTime(Date date) {
        return new SimpleDateFormat("dd/mm/yyyy hh:mm a").format(date);
    }

    public static String formatTime(Date date) {
        return new SimpleDateFormat("hh:mm a").format(date);
    }

    public static String formatDate(Date date) {
        return new SimpleDateFormat("dd/mm/yyyy").format(date);
    }

    public static String formatBestDateTime(Date date) {
        if (differentInDays(new Date(), date) > 1) {
            return formatDateTime(date);
        }
        return formatTime(date);
    }

    public static int differentInDays(Date d1, Date d2) {
        return  (int)((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
}
