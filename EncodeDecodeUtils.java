package com.epps.beans;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeUtils {
	
	public String encode(String text) throws UnsupportedEncodingException {
		Encoder encoder =  Base64.getEncoder();
		byte[] encodeByteArray = encoder.encode(text.getBytes());
		String encodedEmailString = new String(encodeByteArray, "UTF-8");
		return encodedEmailString;
	}
	
	public String decode(String text) throws UnsupportedEncodingException {
		Decoder decoder = Base64.getDecoder();
		byte[] decodeByteArray = decoder.decode(text.getBytes());
		String decodedEmailString = new String(decodeByteArray, "UTF-8");
		return decodedEmailString;
	}
}
