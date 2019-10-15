package stepik_4_3.stepik_4_3_2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {

    private final Logger logger;

    Spy(Logger bufLogger) {
        this.logger = bufLogger;

    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (!(mail instanceof MailMessage)) {
            return mail;
        }
        MailMessage mailMessage = (MailMessage) mail;
        if (mailMessage.getFrom().equals(AUSTIN_POWERS) | mailMessage.getTo().equals(AUSTIN_POWERS)) {
            logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                    new Object[]{mailMessage.getFrom(), mailMessage.getTo(), mailMessage.getMessage()});
        } else {
            logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{mailMessage.getFrom(), mailMessage.getTo()});
        }
        return mail;
    }
}
