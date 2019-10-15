package stepik_4_3.stepik_4_3_2;



public class UntrustworthyMailWorker implements MailService {

    private MailService[] mailService;
    private final MailService realMailService = new RealMailService();

    UntrustworthyMailWorker(MailService[] mails) {
        this.mailService = mails.clone();
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable mailProcced = mail;
        for (int i = 0; i < mailService.length; i++) {
            mailProcced = mailService[i].processMail(mailProcced);
        }
        return realMailService.processMail(mailProcced);

    }
}
