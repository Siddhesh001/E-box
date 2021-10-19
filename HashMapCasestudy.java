package Collections_Framework;

import java.util.HashMap;

public class HashMapCasestudy {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.storeCountryCapital("UK","London");
		countryMap.storeCountryCapital("India", "Delhi");
		countryMap.storeCountryCapital("Australia", "Canberra");
		
		System.out.println(countryMap.retriveCapital("India"));
		System.out.println(countryMap.retriveCapital("UK"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}
}
