public class Electronics {
    private String name;
    private String manufacturer;
    private String releaseDate;

    public Electronics(String name, String manufacturer, String releaseDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
