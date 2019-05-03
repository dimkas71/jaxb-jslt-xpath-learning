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
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	
	@XmlAttribute(name = "id")
	private String id;
	
	private String author;
	private String title;
	private String genre;
	private float price;
	
	@XmlElement(name="publish-date")
	private String publishDate; //TODO: change type from String to LocalDate
	private String description;
	

}
