public class MemeViewer implements Observer {
    private String name;

    public MemeViewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String meme) {
        System.out.println(name + " received updated meme: " + meme);
    }
}