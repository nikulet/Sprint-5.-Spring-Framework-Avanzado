package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private String message;
    private String descriptionError;
}
