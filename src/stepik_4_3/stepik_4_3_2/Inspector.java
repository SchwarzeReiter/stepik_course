package stepik_4_3.stepik_4_3_2;

public class Inspector implements MailService {


    @Override
    public Sendable processMail(Sendable mail) {

       if(mail instanceof MailPackage)
       {
           MailPackage mailPackage = (MailPackage)mail;
           if(mailPackage.getContent().getContent().contains(WEAPONS)||mailPackage.getContent().getContent().contains(BANNED_SUBSTANCE))
           {
               throw new IllegalPackageException();
           }

           else if(mailPackage.getContent().getContent().contains("stones") ){
               throw new StolenPackageException();
           }

       }

        return mail;
    }
}
