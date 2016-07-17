package com.boz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author suzhibo
 */
public class ExceptionLog extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log=LogManager.getLogger(ExceptionLog.class);
	public String execute(){
		System.out.println("Exception");
		return Action.SUCCESS;
	}
}
