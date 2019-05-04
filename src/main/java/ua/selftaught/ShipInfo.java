package ua.selftaught;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "ShipInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipInfo {
	
	@XmlAttribute(name = "ShippedDate")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime shippedDate;
	
	@XmlElement(name = "ShipVia")
	private int shipVia;
	
	@XmlElement(name = "Freight")
	private float freight;
	
	@XmlElement(name = "ShipName")
	private String shipName;
	
	@XmlElement(name = "ShipAddress")
	private String shipAddress;
	
	@XmlElement(name = "ShipCity")
	private String shipCity;
	
	@XmlElement(name = "ShipRegion")
	private String shipRegion;
	
	@XmlElement(name = "ShipPostalCode")
	private String shipPostalCode;
	
	@XmlElement(name = "ShipCountry")
	private String shipCountry;
	

}
