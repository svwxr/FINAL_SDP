public class FancyCaptionStrategy implements CaptionStrategy {
    @Override
    public String addCaption(String memeText) {
        return memeText + " ~*~FancyCaption~*~";
    }
}