import java.sql.SQLOutput;
public class Main {
    public static void main (String[] args){
        Avtomobil Audi= new Avtomobil();
        Audi.Marka = "Audi";
        Audi.Model = "Audi A6";
        Audi.PomKm = "200000";
        System.out.println("Marka na Avtomobilot e : " + Audi.Audi +".");
        System.out.println("Modelot na " + Audi + ".");
        System.out.println("Negovite Pominati Kilometri se " + PomKm +"km.");
        System.out.println("");
        Avtomobil Reno = new Avtomobil("Reno", "Laguna", "220000");
        System.out.println("Markata na avtomobilot e: " + Reno.Marka + ", Modelot e: "+ Reno.Model + ", Negovite pominati kilometri se: " + Reno.PomKm + "km.");
        System.out.println("");
        Avtomobil Seat = new Avtomobil("Seat" , "Leon" , "360220");
        System.out.println("Vozam avtomobil " + Seat.Marka + ", Modelot e: " + Seat.Model + ", i e so pominati kilometri " + Seat.PomKm + "km.");
    }
}
class Avtomobil {
    public String Marka;
    public String Model;
    public String PomKm;
    public Avtomobil (){
    }
    public Avtomobil (String Marka, String Model, String PomKm){
        this.Marka = Marka;
        this.Model = Model;
        this.PomKm = PomKm;
    }
}
