package ua.selftaught;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	
	@XmlAttribute(name = "CustomerID")
	private String id;
	
	@XmlElement(name = "CompanyName")
	private String companyName;
	
	@XmlElement(name = "ContactName")
	private String contactName;
	
	
	@XmlElement(name = "ContactTitle")
	private String contactTitle;
	
	@XmlElement(name = "Phone", nillable = true)
	private String phone;
	
	@XmlElement(name = "Fax", nillable = true)
	private String fax;
	
	@XmlElement(name = "FullAddress")
	private Address address;

}
