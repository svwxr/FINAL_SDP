public class SimpleMemeFactory implements MemeFactory {
    @Override
    public MemeGenerator createMemeGenerator() {

        return new MemeGenerator();
    }
}