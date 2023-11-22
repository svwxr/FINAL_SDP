public class FancyMemeFactory implements MemeFactory {
    @Override
    public MemeGenerator createMemeGenerator() {
        MemeGenerator memeGenerator = new MemeGenerator();
        memeGenerator.setCaptionStrategy(new FancyCaptionStrategy());
        return memeGenerator;
    }
}