public class FilterDecorator implements MemeDecorator {
    @Override
    public String decorateMeme(String meme) {
        return meme + " with Filter";
    }
}