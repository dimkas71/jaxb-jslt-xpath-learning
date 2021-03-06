package ua.selftaught;

import java.util.ArrayList;
import java.util.List;

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
@XmlRootElement(name = "ovdplist")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrencyRates {
	
	@XmlElement(name = "ovdp")
	private List<CurrencyRate> rates = new ArrayList<>();
	
}
