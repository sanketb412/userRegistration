package com;

public class UserAnalysisException extends Throwable {
    enum ExceptionType {
        Entered_Empty, Entered_valid
    }

    ExceptionType type;
    public UserAnalysisException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
