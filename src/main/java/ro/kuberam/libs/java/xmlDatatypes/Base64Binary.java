package ro.kuberam.libs.java.xmlDatatypes;

import java.util.Base64;

public class Base64Binary {

	public static byte[] ToByteArray(String data) {
		return Base64.getDecoder().decode(data);
	}
}
