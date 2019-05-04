package ua.selftaught;

import java.time.LocalDate;

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
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	
	@XmlAttribute(name = "id")
	private String id;
	
	private String author;
	private String title;
	private String genre;
	private float price;
	
	@XmlElement(name="publish_date")
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate publishDate; 
	
	private String description;
	

}
