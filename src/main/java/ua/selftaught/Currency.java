package ua.selftaught;

import java.time.LocalDate;

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
@XmlRootElement(name = "currency")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {
	
	@XmlElement(name = "date")
	@XmlJavaTypeAdapter(SimpleLocalDateAdapter.class)
	private LocalDate date;
	
	@XmlElement(name = "digital_code")
	private int digitalCode;
	
	@XmlElement(name = "letter_code")
	private String letterCode;
	
	@XmlElement(name = "number_of_units")
	private int numberOfUnits;
	
	@XmlElement(name = "currency_name")
	private String currencyName;
	
	@XmlElement(name = "exchange_rate")
	private double exchangeRate;
	
}
