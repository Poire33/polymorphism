package ie.atu.productv5;

public class Software extends Product {
    private String version;
    private int count;

    public Software() {
        super();
        version = "";
        count++;
    }


    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return super.toString() + " " + version;
    }
}
