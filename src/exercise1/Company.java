package exercise1;

public class Company {
    private String companyName;
    private AdvertiseServiceProvider advertiseServiceProvider;

    public Company(String companyName, AdvertiseServiceProvider advertiseServiceProvider) {
        this.companyName = companyName;
        this.advertiseServiceProvider = advertiseServiceProvider;
    }

    public String getCompanyName() {
        return companyName;
    }

    public AdvertiseServiceProvider getAdvertiseServiceProvider() {
        return advertiseServiceProvider;
    }
}
