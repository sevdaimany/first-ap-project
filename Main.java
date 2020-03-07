package test;

public class Main {
    public static void main(String[] args) {
           var dimentions  = new Dimentions(20,20,40);
        var thecase = new Case("1220", "asus", 240, dimentions);

        var monitor = new Monitor("5420","LG",new Resolution(1920,960));

        var motherboard = new MotherBoard("90800","Asus",4,6);

        PC pc = new PC(monitor,motherboard,thecase);
        pc.getMonitor().DrawPixle(2,3,"red");
        System.out.println( pc.getMotherBoard().getBrand());
        pc.getTheCase().powerPress();
        System.out.println(pc.getTheCase().getDimentions().getWidth());
    }
}