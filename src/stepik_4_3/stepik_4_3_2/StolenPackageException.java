package stepik_4_3.stepik_4_3_2;

public class StolenPackageException extends RuntimeException{

     StolenPackageException(){
        super("Stones!!");
    }
}


 public static class IllegalPackageException extends RuntimeException {
    IllegalPackageException()
    {
        super("guns and roses!");
    }
}
