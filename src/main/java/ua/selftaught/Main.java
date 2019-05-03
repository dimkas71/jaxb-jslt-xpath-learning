package ua.selftaught;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jbc = JAXBContext.newInstance(Person.class);
		
		Marshaller m = jbc.createMarshaller();
		
		StringWriter sw = new StringWriter();
		m.marshal(new Person("Dimkas", 47), sw);
		
		Unmarshaller um = jbc.createUnmarshaller();
		
		Person p = (Person) um.unmarshal(new StringReader(sw.toString()));
		
		System.out.println(sw.toString());
		
		System.out.println(p);
		
		

	}

}
