package ua.selftaught;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private String id;
	private String author;
	private String title;
	private String genre;
	private float price;
	private String publishDate; //TODO: change type from String to LocalDate
	private String description;
	

}
