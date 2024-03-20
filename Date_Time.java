
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


class LocalDatE { 
    public static void main(String[] args) {
        LocalDate l1= LocalDate.now();
       // System.out.println(ld);
       LocalTime l2= LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(l2);
        LocalTime l3= LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(l3);
        LocalDate d1=LocalDate.now(ZoneId.of("America/Los_Angeles"));
        LocalDate d2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println( LocalDate.ofEpochDay(1)); // iska matlab 1 jan 1970 ke 1 din baad ki date
        // 1 jan 1970 ko hi epoch
        System.out.println();
        System.out.println( LocalDate.of(2020,5,9));
        System.out.println();
        LocalDate d3=LocalDate.now();
        System.out.println((d3.getMonth())+"/"+(d3.getDayOfMonth())+"/"+(d3.getYear()));
        LocalDate d4= d3.plusDays(12);
        System.out.println("date after is "+d4);
        LocalTime l4=l3.minusHours(5);
        System.out.println(l3);

        LocalDateTime ldt=LocalDateTime.now();

        //System.out.println(l3.get(ChronoField.ERA));
        DateTimeFormatter dt= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        dt.format(ldt);

    }
}
