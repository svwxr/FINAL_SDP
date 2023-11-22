public class SimpleCaptionStrategy implements CaptionStrategy {
    @Override
    public String addCaption(String memeText) {
        return memeText + " #SimpleCaption";
    }
}

