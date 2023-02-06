public class Main {
    public static void main(String[] args) {
        Service service = new ServiceAdapter(new OtherService());
        service.method(1);
    }
}
