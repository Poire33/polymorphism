package ie.atu.productv5;

public class TV extends Product {
    private String screen_size;
    private String manufacturer;
    private int count;

    public TV() {
        super();
        screen_size = "";
        manufacturer = "";
        count++;
    }

    public String getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(String screen_size) {
        this.screen_size = screen_size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "screen_size='" + screen_size + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
