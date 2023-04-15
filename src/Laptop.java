public class Laptop extends Electronics{
    private boolean hasAntivirus;

    public Laptop(String name, String manufacturer, String releaseDate, boolean hasAntivirus) {
        super(name, manufacturer, releaseDate);
        this.hasAntivirus = hasAntivirus;
    }
    public boolean hasAntivirus(){return hasAntivirus;}
}
