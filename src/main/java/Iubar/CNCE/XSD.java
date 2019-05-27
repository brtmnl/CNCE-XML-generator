package Iubar.CNCE;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
//import java.net.URL;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

public class XSD {

	public static void main(String[] args) {
		//URL schemaFile = new URL("http://host:port/filename.xsd");
		// webapp example xsd: 
		// URL schemaFile = new URL("http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");
		// local file example:
		File schemaFile = new File("C:\\Users\\iubar\\iubar\\workspace\\CNCE-XML-generator\\src\\main\\resources\\xsd\\CNCE_FlussoInput.xsd"); // etc.
		Source xmlFileI = new StreamSource(new File("C:\\Users\\iubar\\iubar\\workspace\\CNCE-XML-generator\\src\\main\\resources\\xml\\FlussoInput.xml"));
		Source xmlFileO = new StreamSource(new File("C:\\Users\\iubar\\iubar\\workspace\\CNCE-XML-generator\\src\\main\\resources\\xml\\FlussoOutput.xml"));
		SchemaFactory schemaFactory = SchemaFactory
		    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
		  Schema schema = schemaFactory.newSchema(schemaFile);
		  Validator validator = schema.newValidator();
		  validator.validate(xmlFileI);
		  System.out.println(xmlFileI.getSystemId() + " is valid");
		} catch (SAXException e) {
		  System.out.println(xmlFileI.getSystemId() + " is NOT valid reason:" + e);
		} catch (IOException e) {}

		try {
			  Schema schema = schemaFactory.newSchema(schemaFile);
			  Validator validator = schema.newValidator();
			  validator.validate(xmlFileO);
			  System.out.println(xmlFileO.getSystemId() + " is valid");
			} catch (SAXException e) {
			  System.out.println(xmlFileO.getSystemId() + " is NOT valid reason:" + e);
			} catch (IOException e) {}
	}

}
