package exercise1;

public class Facebook implements AdvertiseServiceProvider {

    private static final String NAME_OF_ADVERTISER = "Facebook";
    private int serviceValue;

    public Facebook(int serviceValue) {
        this.serviceValue = serviceValue;
    }

    @Override
    public String getName() {
        return NAME_OF_ADVERTISER;
    }

    @Override
    public int getServiceValue() {
        return serviceValue;
    }

    @Override
    public void doAdvertise() {
        System.out.println("You ads were seen on Facebook by 1 million people! Great!");
    }
}
