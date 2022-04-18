/**
 * 
 */
package com.ws.exception;

/**
 * @author ranjeet
 *
 */
public class FDAException extends Exception {

	@Override
	public String getMessage() {
		return "FDA-ERROR" + super.getMessage();
	}

	public FDAException() {
		super(new FDAException("FDA-ERROR", null));
	}

	public FDAException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FDAException(String arg0) {
		super(new FDAException("FDA-ERROR" + arg0, null));
	}

	public FDAException(Throwable arg0) {
		super(new FDAException("FDA-ERROR", arg0));
	}

}
