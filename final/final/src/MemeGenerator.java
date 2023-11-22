import java.util.ArrayList;
import java.util.List;

public class MemeGenerator {
    private static MemeGenerator instance;

    private CaptionStrategy captionStrategy;
    private List<MemeDecorator> decorators = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    MemeGenerator() {
        // private constructor to prevent instantiation
    }

    public static MemeGenerator getInstance() {
        if (instance == null) {
            instance = new MemeGenerator();
        }
        return instance;
    }

    public void setCaptionStrategy(CaptionStrategy captionStrategy) {
        this.captionStrategy = captionStrategy;
    }

    public void addDecorator(MemeDecorator decorator) {
        decorators.add(decorator);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String meme) {
        for (Observer observer : observers) {
            observer.update(meme);
        }
    }

    public String generateMeme(String memeText) {
        String captionedText = captionStrategy.addCaption(memeText);
        String meme = "Meme: " + captionedText;
        notifyObservers(meme);
        return meme;
    }

    public String generateDecoratedMeme(String memeText) {
        String decoratedMeme = "Meme: " + memeText;
        for (MemeDecorator decorator : decorators) {
            decoratedMeme = decorator.decorateMeme(decoratedMeme);
        }
        notifyObservers(decoratedMeme);
        return decoratedMeme;
    }
}