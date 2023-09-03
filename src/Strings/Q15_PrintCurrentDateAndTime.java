package Strings;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Q15_PrintCurrentDateAndTime {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);


    }
}
