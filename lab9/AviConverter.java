public class AviConverter implements VideoConverter {
    @Override
    public void convert(String filePath) {
        System.out.println("Converting .avi video " + filePath);
    }
}