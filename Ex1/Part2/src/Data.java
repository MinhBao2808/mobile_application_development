import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="data")

public class Data implements Serializable {
    private double latitudeA;
    private double latitudeB;
    private double longitudeA;
    private double longitudeB;
    private double result;
    public Data() {}

    public Data(double latitudeA, double latitudeB, double longitudeA, double longitudeB, double result) {
        this.latitudeA = latitudeA;
        this.latitudeB = latitudeB;
        this.longitudeA = longitudeA;
        this.longitudeB = longitudeB;
        this.result = result;
    }

    public double getLatitudeA() {
        return latitudeA;
    }
    @XmlElement
    public void setLatitudeA(double latitudeA) {
        this.latitudeA = latitudeA;
    }

    public double getLatitudeB() {
        return latitudeB;
    }
    @XmlElement
    public void setLatitudeB(double latitudeB) {
        this.latitudeB = latitudeB;
    }

    public double getLongitudeA() {
        return longitudeA;
    }
    @XmlElement
    public void setLongitudeA(double longitudeA) {
        this.latitudeA = longitudeA;
    }

    public double getLongitudeB() {
        return longitudeB;
    }
    @XmlElement
    public void setLongitudeB(double longitudeB) {
        this.latitudeB = longitudeB;
    }

    public double getResult() {
        return result;
    }
    @XmlElement
    public void setResult(double result) {
        this.result = result;
    }
}
