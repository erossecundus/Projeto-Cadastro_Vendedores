package com.abutua.cadvendedores_backend.services.exceptions;

public class DatabaseException extends RuntimeException {
  public DatabaseException (String message){
    super(message);
  }
  
}
