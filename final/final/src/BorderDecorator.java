public class BorderDecorator implements MemeDecorator {
    @Override
    public String decorateMeme(String meme) {

        return meme + " with Border";
    }
}