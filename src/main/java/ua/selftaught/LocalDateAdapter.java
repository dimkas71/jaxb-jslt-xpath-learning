package ua.selftaught;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public final class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE;
	
	@Override
	public LocalDate unmarshal(String v) throws Exception {
		return LocalDate.parse(v, FORMATTER);
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		return v.format(FORMATTER);
	}

}
