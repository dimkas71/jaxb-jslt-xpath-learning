package ua.selftaught;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class CurrencyRatesReader {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(
				CurrencyRates.class,
				CurrencyRate.class,
				ArrayList.class,
				Currencies.class,
				Currency.class);
		
		Unmarshaller um = jaxbContext.createUnmarshaller();
		
		CurrencyRates rates = (CurrencyRates) um.unmarshal(new File("uah_rates.xml"));
		
		//System.out.println(rates);
		
		CurrencyRates toWrite = new CurrencyRates();
		
		
		List<CurrencyRate> filteredRates = rates.getRates().stream()
			.filter(cr -> cr.getPayDate().compareTo(LocalDate.of(2019, 1, 1)) >= 0)
			.collect(Collectors.toList());
		
		toWrite.setRates(filteredRates);
		
		Marshaller m = jaxbContext.createMarshaller();
		
		//m.marshal(toWrite, System.out);
		
		Currencies currRates = (Currencies) um.unmarshal(new File("search_results.xml"));
		
		System.out.println(currRates);
		
		
		
		
		
	}

}
