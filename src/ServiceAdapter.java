public class ServiceAdapter extends Service {

    private OtherService otherService;

    public ServiceAdapter(OtherService otherService) {
        this.otherService = otherService;
    }

    @Override
    public void method(int i) {
        otherService.method(String.valueOf(i));
    }
}
