

public class BufferedReader {
    public static void main(String[] args){
        Bufferedreader InputRead = new Bufferedreader(new InputStreamReader(System.in));
        String name;
        try {
            System.out.println("enter your name");
            Name = InputRead.readline();
            System.out.println("NAME" + name);
        }catch (Exception ignored){
    }
}
