package rozetka.pageElements;

public class Sleep {

    public static void driverWait(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
