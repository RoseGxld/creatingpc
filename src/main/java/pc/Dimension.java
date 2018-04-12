package pc;

public class Dimension {

private double width;
private double hight;
private double depth;

    public Dimension(double width, double hight, double depth) {
        this.width = width;
        this.hight = hight;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", hight=" + hight +
                ", depth=" + depth +
                '}';
    }
}
