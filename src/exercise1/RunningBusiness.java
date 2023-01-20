package exercise1;

public class RunningBusiness {
    public static void main(String[] args) {
        Company unpopularCompany = new Company("Unpopular Company", new Facebook(3000));
        System.out.printf("%s has %s for ads and it costs %s$. \n", unpopularCompany.getCompanyName(),
                unpopularCompany.getAdvertiseServiceProvider().getName(),
                unpopularCompany.getAdvertiseServiceProvider().getServiceValue());

        unpopularCompany.getAdvertiseServiceProvider().doAdvertise();

        Company smartCompany = new Company("Smart Company", new EmailAdvertiseCompany(10000));
        System.out.printf("\n%s has %s for ads and it costs %s$. \n", smartCompany.getCompanyName(),
                smartCompany.getAdvertiseServiceProvider().getName(),
                smartCompany.getAdvertiseServiceProvider().getServiceValue());

        smartCompany.getAdvertiseServiceProvider().doAdvertise();

        Company poorCompany = new Company("Poor Company", new PrintedFlyers(10));
        System.out.printf("\n%s has %s for ads and it costs %s$. \n", poorCompany.getCompanyName(),
                poorCompany.getAdvertiseServiceProvider().getName(),
                poorCompany.getAdvertiseServiceProvider().getServiceValue());

        poorCompany.getAdvertiseServiceProvider().doAdvertise();
    }
}
