package ua.selftaught;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jbc = JAXBContext.newInstance(Person.class,
							Book.class,
							Books.class,
							Customer.class,
							Customers.class,
							Order.class,
							Orders.class,
							ShipInfo.class,
							Root.class,
							Address.class);
		
		Marshaller m = jbc.createMarshaller();
		
		StringWriter sw = new StringWriter();
		m.marshal(new Person("Dimkas", 47), sw);
		
		Unmarshaller um = jbc.createUnmarshaller();
		
		Person p = (Person) um.unmarshal(new StringReader(sw.toString()));
		
		System.out.println(sw.toString());
		
		System.out.println(p);
		
		
		//2. Read the list of books from file books.xml
		
		String userDirStr = System.getProperty("user.dir");
		
		Objects.nonNull(userDirStr);
		
		Path userDir = Paths.get(userDirStr);
		
		if (Files.exists(userDir.resolve("books.xml"))) {
			
			Books catalog = (Books)um.unmarshal(userDir.resolve("books.xml").toFile());
			
			System.out.println(catalog);
			
			//Marshall the first book to the System.out
			Book first = catalog.getBooks().get(0);
			
			m.marshal(first, System.out);
			
		}
		
		if (Files.exists(userDir.resolve("customers.xml"))) {
			Root root = (Root) um.unmarshal(userDir.resolve("customers.xml").toFile());
			System.out.println(root);
		}
		
		
		

	}

}
