package org.jmu.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {



    public String dateFormat(long currentTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date = new Date(currentTime);
        return simpleDateFormat.format(date).toString();
    }

}
