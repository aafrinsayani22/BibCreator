// **************************  Final Project   ****************************
// *                                                                      *
// *     Group Members: Aafrin (2030150) , Anubha (2032178)               *
// *                                                                      *
// ************************************************************************


public class FileInvalidException extends Exception{


    public FileInvalidException() {
        super("Error: Input file cannot be parsed due to missing information\n" +
                "(i.e. month={}, title={}, etc.)");
    }

    public FileInvalidException(String message) {
        super(message);
    }

    @Override
    public String getMessage () {
        return super.getMessage();
    }

}
