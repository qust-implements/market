package edu.qust.market.framework.message;

import edu.qust.market.framework.bean.WebModel;

import java.util.HashMap;
import java.util.Map;





public class Message {

	private boolean success;
	
	private String errorName;
	
	private int errorCode;
	
	private String message;
	
	
	private Map<String,Object> result = new HashMap<String,Object>();
	
	
	public Message addData(String key,Object value){
		this.result.put(key, value);
		return this;
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	public static Message createSuccessMessage(WebModel wm){
		
		return Message.createSuccessMessage("", wm);
	}
	
	public static Message createSuccessMessage(String message, WebModel vm){
		
		Message m = new Message();
		m.success = true;
		m.message = message;
		
		if(vm != null){
			m.result.put("data", vm.getData());
//			m.result.put("pag1", vm.getPag1());
//			m.result.put("pag2", vm.getPag2());
			m.result.put("ps", vm.getPs());
			m.result.put("sp", vm.getSp());
			m.result.put("tp", vm.getTp());
			m.result.put("tc", vm.getTc());
		}

		return m;
	}
	
	public static Message createSuccessMessage(String message,Object data){
		
		Message m = new Message();
		m.success = true;
		m.message = message;
		if(data != null){
			m.result.put("data", data);
		}
		
		return m;
	}
	
	public static Message createSuccessMessage(Object data){
		
		return Message.createSuccessMessage("", data);
	}
	
	public static Message createSuccessMessage(){
		
		return Message.createSuccessMessage("", null);
	}

	
	public static Message createFailureMessage(ErrorEnum err,String message,Object data){
		
		Message m = new Message();
		m.success = false;
		m.errorName = err.getErrorName();
		m.errorCode = err.getErrorCode();
		m.message = message;
		m.result.put("data", data);
		return m;
	}
	
	public static Message createFailureMessage(ErrorEnum err,String message){
		
		return Message.createFailureMessage(err, message, null);
	}
	
	public static Message createFailureMessage(ErrorEnum err){
		
		return Message.createFailureMessage(err, "", null);
	}
	
	
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Map<String, Object> getResult() {
		return result;
	}


	public void setResult(Map<String, Object> result) {
		this.result = result;
	}


	
	
	
}
