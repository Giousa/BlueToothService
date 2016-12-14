package com.giou.bluetoothservice;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/14
 * Email:65489469@qq.com
 */
public class DeviceBean {
	protected String message;
	protected boolean isReceive;

	public DeviceBean(String msg, boolean isReceive) {
		this.message = msg;
		this.isReceive = isReceive;
	}
}