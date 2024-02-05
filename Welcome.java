package com.epps.beans;

import java.io.UnsupportedEncodingException;

public class Welcome {

	public Welcome(){
	
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		EncodeDecodeUtils encodeDecodeUtils = new EncodeDecodeUtils();
		String encodeString  = encodeDecodeUtils.encode("123124Sagar123");
		System.out.println(encodeString);
		String decodeString = encodeDecodeUtils.decode(encodeString);
		System.out.println(decodeString);
	}
}
