package com.foriba.esmm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UtilsIO {
	
	public static byte[] readBytesFromFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);
		long length = file.length();

		if (length > Integer.MAX_VALUE) {
			is.close();
			throw new IOException("Could not completely read file " + file.getName() + " as it is too long (" + length
					+ " bytes, max supported " + Integer.MAX_VALUE + ")");
		}

		byte[] bytes = new byte[(int) length];

		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}
		
		if (offset < bytes.length) {
			is.close();
			throw new IOException("Could not completely read file " + file.getName());
		}
		
		is.close();
		return bytes;
	}

}
