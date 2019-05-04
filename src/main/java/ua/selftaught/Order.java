package ua.selftaught;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

	@XmlElement(name = "CustomerID")
	private String customerId;
	
	@XmlElement(name = "EmployeeID")
	private int employeeId;
	
	@XmlElement(name = "OrderDate")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime orderDate;
	
	@XmlElement(name = "RequiredDate")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime requiredDate;
	
	@XmlElement(name = "ShipInfo")
	private ShipInfo shipInfo;
	
	
	
}
