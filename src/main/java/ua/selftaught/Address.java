package ua.selftaught;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "FullAddress")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
	
	@XmlElement(name = "Address")
	private String address;
	
	@XmlElement(name = "City")
	private String city;
	
	@XmlElement(name = "Region")
	private String region;
	
	@XmlElement(name = "PostalCode")
	private String postalCode;
	
	@XmlElement(name = "Country")
	private String country;

}
