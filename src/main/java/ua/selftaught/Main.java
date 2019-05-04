package ua.selftaught;

import java.io.File;
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

import ua.selftaught.model.ObjectFactory;
import ua.selftaught.model.Root.Customers.Customer.FullAddress;

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
			
			JAXBContext jbcGenerated = JAXBContext.newInstance(ObjectFactory.class);
			
			Unmarshaller umGen = jbcGenerated.createUnmarshaller();
			
			Marshaller mGen = jbcGenerated.createMarshaller();
			
			
			ua.selftaught.model.Root rootGen = (ua.selftaught.model.Root) umGen.unmarshal(userDir.resolve("customers.xml").toFile());
			
			System.out.println(rootGen);
			
			
			ua.selftaught.model.Root.Customers.Customer customer = new ua.selftaught.model.Root.Customers.Customer();
			
			customer.setCompanyName("Compservice LTD");
			customer.setContactName("Contract #1");
			customer.setContactTitle("For my salary");
			customer.setPhone("000 121-11-23");
			
			FullAddress address = new ua.selftaught.model.Root.Customers.Customer.FullAddress();
			
			address.setCity("Chernivtsi");
			address.setAddress("Holovna str, 151");
			address.setCountry("Ukraine");
			address.setPostalCode(6);
			address.setRegion("Bukovina");
			
			
			customer.setFullAddress(address);
			
			
			mGen.marshal(customer, System.out);
			
			mGen.marshal(customer, new File("cust.xml"));
			
		}
		
		
		

	}

}
