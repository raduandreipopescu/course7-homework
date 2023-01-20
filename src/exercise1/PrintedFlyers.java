package exercise1;

public class PrintedFlyers implements AdvertiseServiceProvider {
    private static final String NAME_OF_ADVERTISER = "Printed Flyers";
    private int serviceValue;

    public PrintedFlyers(int serviceValue) {
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
        System.out.println("We printed and distributed flyers with your ads to 100 people! Not great, not terrible!");
    }
}
