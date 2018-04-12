package pc;

public class Main {
    public static void main(String[] args) {

        PC pc = new PC(new Monitor("Mac Book","Apple",26, new Resolution(26.0,32.0)),
        new Motherboard("BJ-2000","Asus",4,6,"v2.44"),
                new Case("zzx10","Dell","110V",new Dimension(28.5,36.5,15.0)));

        System.out.println("=====================================================================================================");

        System.out.println(pc);

        System.out.println("======================================================================================================");

        pc.powerUp();

        System.out.println("======================================================================================================");

        pc.getMonitor().showLogo(26,32,"green");
        pc.getMotherboard().loadProgram("Droses Program");





    }
}
