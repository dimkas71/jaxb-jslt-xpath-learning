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
@XmlRootElement(name = "ovdp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrencyRate {
	
	@XmlElement(name = "auctiondate")
	@XmlJavaTypeAdapter(SimpleLocalDateAdapter.class)
	private LocalDate auctionDate;
	
	@XmlElement(name = "auctionnum")
	private int auctionNumber;
	
	@XmlElement(name = "valcode")
	private String code;
	
	@XmlElement(name = "stockcode")
	private String stockCode;
	
	@XmlElement(name = "paydate")
	@XmlJavaTypeAdapter(SimpleLocalDateAdapter.class)
	private LocalDate payDate;
	
	@XmlElement(name = "repaydate")
	@XmlJavaTypeAdapter(SimpleLocalDateAdapter.class)
	private LocalDate repayDate;
	
	@XmlElement(name = "stockrestrict")
	private int stockRestrict;
	
	@XmlElement(name = "stockrestrictn")
	private int stockRestrictn;
	
	@XmlElement(name = "incomelevel")
	private float incomeLevel;
	
	@XmlElement(name = "avglevel")
	private float avgLevel;
	
	@XmlElement(name = "amount")
	private int amount;
	
	@XmlElement(name = "amountn")
	private int amountn;
	
	@XmlElement(name = "attraction")
	private float attraction;
	

}
