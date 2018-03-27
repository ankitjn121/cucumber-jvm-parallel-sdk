package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadUIConstants {

	public static String getPropertyValue(String propertyName) {

		Properties conf = new Properties();

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("./src/main/resources/application.properties");

			conf.load(fis);
			String value = conf.getProperty(propertyName);

			return value;

		}

		catch (FileNotFoundException e) {
			System.out.println("File not present in the given location");
			return null;
		} catch (IOException e) {
			System.out.println("The given Property Name is not present in the file");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		/*
		 * finally { try { fis.close(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); } System.out.println("File Stream Closed"); }
		 */

	}

}
