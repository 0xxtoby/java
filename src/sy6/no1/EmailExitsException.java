package sy6.no1;

public class EmailExitsException extends Throwable {
    public EmailExitsException() {
    }

    public EmailExitsException(String message) {
        super(message);
    }

    public EmailExitsException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailExitsException(Throwable cause) {
        super(cause);
    }

    public EmailExitsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
