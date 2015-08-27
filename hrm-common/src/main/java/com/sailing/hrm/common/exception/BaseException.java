package com.sailing.hrm.common.exception;
/**
 * @auther guanxianchun
 * @description
 * @version 1.0
 * @date 2015年8月19日 下午2:57:03
 */
public class BaseException extends Exception {

	private String code;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BaseException(Throwable exception) {
        super(exception);
    }
	
	public BaseException() {
        super();
    }
	/**
	 * 
	 * @auther guanxianchun
	 * @description 带错误码的构造函数
	 * @version 1.0
	 * @date 2015年8月19日 下午2:59:04
	 */
	public BaseException(String code) {
        super();
        this.code = code;
    }
	/**
	 * 
	 * @auther guanxianchun
	 * @description
	 * @version 1.0
	 * @date 2015年8月19日 下午3:01:06
	 */
	public BaseException(String code,String message) {
        super(message);
        this.code = code;
    }
	/**
	 * 
	 * @auther guanxianchun
	 * @description
	 * @version 1.0
	 * @date 2015年8月19日 下午3:01:03
	 */
	public BaseException(String code,Throwable exception) {
        super(exception);
        this.code = code;
    }
	/**
	 * 
	 * @auther guanxianchun
	 * @description 
	 * @version 1.0
	 * @date 2015年8月19日 下午3:00:59
	 */
	public BaseException(String code,String message,Throwable exception) {
		super(message, exception);
        this.code = code;
    }
}
