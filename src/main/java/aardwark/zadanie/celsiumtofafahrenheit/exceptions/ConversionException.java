package aardwark.zadanie.celsiumtofafahrenheit.exceptions;

public class ConversionException extends  RuntimeException {

    public ConversionException(String message, Throwable cause){
        super(message, cause);
    }
    public ConversionException(String message){
        super(message);
    }
}
