package stepik_4_3.stepik_4_3_2;

public class Thief implements MailService {

    private final int cost;
    private int sumCost = 0;

    Thief(int cost) {
        this.cost = cost;
    }

    public int getStolenValue() {
        return sumCost;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage && mail != null) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice() >= cost) {
                sumCost += mailPackage.getContent().getPrice();
                return new MailPackage(mailPackage.from, mailPackage.to, new Package("stones instead of " + mailPackage.getContent().getContent(), 0));
            }
        }

        return mail;
    }


}
