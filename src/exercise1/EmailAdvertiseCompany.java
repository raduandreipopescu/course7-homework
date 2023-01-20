package exercise1;

public class EmailAdvertiseCompany implements AdvertiseServiceProvider {
    private static final String NAME_OF_ADVERTISER = "Email Advertise Company";
    private int serviceValue;

    public EmailAdvertiseCompany(int serviceValue) {
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
        System.out.println("Your ads were sent by email to 1 billion people! Wonderful!");
    }
}
