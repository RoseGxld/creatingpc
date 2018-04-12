package pc;

public class PC {

private Motherboard motherboard;
private Monitor monitor;
private Case aCase;

public PC(Monitor monitor, Motherboard motherboard, Case aCase){
    this.monitor = monitor;
    this.motherboard = motherboard;
    this.aCase = aCase;
}

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getaCase() {
        return aCase;
    }

    @Override
    public String toString() {
        return "PC{" +
                "motherboard=" + motherboard +
                ", monitor=" + monitor +
                ", aCase=" + aCase +
                '}';
    }

    private void drawLogo(){
        monitor.showLogo(26,32,"green");
    }
    public void powerUp(){
        drawLogo();
        aCase.pressPowerButton();
    }



}
