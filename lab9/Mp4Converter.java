public class Mp4Converter implements VideoConverter {
    @Override
    public void convert(String filePath) {
        System.out.println("Converting .mp4 video " + filePath);
    }
}