package ua.selftaught;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "Customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers {
	
	@XmlElement(name = "Customer")
	private List<Customer> customers = new ArrayList<>();

}
