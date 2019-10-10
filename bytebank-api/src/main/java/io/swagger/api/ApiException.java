package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

public class ApiException extends Exception{
    public ApiException (int code, String msg) {
        super(msg);
    }
}
