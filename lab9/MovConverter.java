public class MovConverter implements VideoConverter {
    @Override
    public void convert(String filePath) {
        System.out.println("Converting .mov video " + filePath);
    }
}