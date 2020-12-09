package Day8;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testing {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
            date = sdf.parse("1990-1010");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

    }
}

