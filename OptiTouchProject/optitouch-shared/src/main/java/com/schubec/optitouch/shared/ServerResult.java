package com.schubec.optitouch.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.schubec.optitouch.shared.models.Errorcode;

public class ServerResult<T> implements IsSerializable{
	
	
    private boolean successful=true;
    private String errormessage="";
    private Errorcode errorcode=Errorcode.NoError;
    private T payload;
    
    public void setError(Errorcode errorcode, String errormessage) {
	this.setSuccessful(false);
	this.setErrormessage(errormessage);
	this.setErrorcode(errorcode);
    }


    public boolean isSuccessful() {
	return successful;
    }


    public void setSuccessful(boolean successful) {
	this.successful = successful;
    }


    public String getErrormessage() {
	return errormessage;
    }


    public void setErrormessage(String errormessage) {
	this.errormessage = errormessage;
    }


    public Errorcode getErrorcode() {
	return errorcode;
    }


    public void setErrorcode(Errorcode errorcode) {
	this.errorcode = errorcode;
    }


    public T getPayload() {
	return payload;
    }


    public void setPayload(T payload) {
	this.payload = payload;
    }
    
}
