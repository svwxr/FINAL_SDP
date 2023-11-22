public class JpegImageAdapter implements ImageAdapter {
    @Override
    public void displayImage(String imagePath) {

        System.out.println("Displaying JPEG Image: " + imagePath);
    }
}