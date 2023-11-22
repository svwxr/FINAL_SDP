public class Main {
    public static void main(String[] args) {
        MemeGenerator simpleMemeGenerator = MemeGenerator.getInstance();
        simpleMemeGenerator.setCaptionStrategy(new SimpleCaptionStrategy());
        simpleMemeGenerator.addDecorator(new BorderDecorator());
        simpleMemeGenerator.addObserver(new MemeViewer("Viewer1"));

        String memeText = "This is a simple meme!";
        simpleMemeGenerator.generateMeme(memeText);

        MemeFactory fancyFactory = new FancyMemeFactory();
        MemeGenerator fancyMemeGenerator = fancyFactory.createMemeGenerator();
        fancyMemeGenerator.addObserver(new MemeViewer("Viewer2"));

        fancyMemeGenerator.generateMeme(memeText);
        fancyMemeGenerator.generateDecoratedMeme(memeText);

        ImageAdapter jpegAdapter = new JpegImageAdapter();
        ImageAdapter pngAdapter = new PngImageAdapter();
        jpegAdapter.displayImage("image.jpg");
        pngAdapter.displayImage("image.png");
    }
}
