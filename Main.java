import java.util.Scanner;
public class Main {

    public static int worldTime, hour, minute, day, year, trammel, felucca;
    public static Scanner sc;

    public static void main(String[] args) {

        System.out.print("Enter World Time: ");
        sc = new Scanner(System.in);
        worldTime = sc.nextInt();

        hour = calcHour();
        minute = calcMinute();
        day = calcDay();
        year = calcYear();
        trammel = calcTrammel();
        felucca = calcFelucca();

        calcTime();

    }

    public static void calcTime() {

        calcHour();
        calcMinute();
        calcDay();
        calcYear();
        calcTrammel();
        calcFelucca();
        outTime();
    }

    public static int calcHour() {
        return ((worldTime / 60) % 24);
    }

    public static int calcMinute() {
        return (worldTime % 60);
    }

    public static int calcDay() {
        return (((worldTime / 60 / 24) % 365) + 1);
    }

    public static int calcYear() {
        return ((worldTime / 60 / 24 / 365) + 1);
    }

    public static int calcTrammel() {
        return(((worldTime/60/24)%9)+1);
    }

    public static int calcFelucca() {
        return(((worldTime/60/24)%14)+1);
    }

    public static void outTime() {
        System.out.printf("It is " + hour +":%02d" + " on day "+ day +" of the year "+ year + ".\n", minute);
        System.out.println("Trammel is in day " + trammel + " of its 9 day phase.");
        System.out.println("Felucca is in day " + felucca + " of its 14 day phase.");
    }

}
