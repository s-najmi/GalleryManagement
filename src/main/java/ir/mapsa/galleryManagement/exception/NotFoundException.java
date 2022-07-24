package ir.mapsa.galleryManagement.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(value = NOT_FOUND, reason = "Not found the matched record!")
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
