public class Phone extends Electronics{
    private boolean foldable;

    public Phone(String name, String manufacturer, String releaseDate, boolean foldable) {
        super(name, manufacturer, releaseDate);
        this.foldable = foldable;
    }

    public boolean isFoldable() {
        return foldable;
    }
}