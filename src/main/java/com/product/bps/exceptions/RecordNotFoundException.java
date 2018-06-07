package com.product.bps.exceptions;

public class RecordNotFoundException extends Exception{
	
	public RecordNotFoundException() {
		super();
	}

	public RecordNotFoundException(String message) {
        super(message);
    }

	@Override
	public String getMessage() {
		return super.getMessage();
	}

		
}
