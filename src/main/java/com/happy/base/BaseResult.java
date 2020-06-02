package com.happy.base;

import java.io.Serializable;

public class BaseResult<T> implements Serializable{
    private Integer code;
    private String msg;
    private T data;
	public BaseResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseResult(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "BaseResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
    
    
 
}
