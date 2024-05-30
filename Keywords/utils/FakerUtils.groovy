package utils

import com.github.javafaker.Faker

public class FakerUtils {
	private static final Faker faker = new Faker()

	/**
	 * Generate a fake first name
	 * @return A random first name
	 */
	public static String getFirstName() {
		return faker.name().firstName()
	}

	/**
	 * Generate a fake last name
	 * @return A random last name
	 */
	public static String getLastName() {
		return faker.name().lastName()
	}

	/**
	 * Generate a fake email address
	 * @return A random email address
	 */
	public static String getEmail() {
		return faker.internet().emailAddress()
	}

	/**
	 * Generate a fake phone number
	 * @return A random phone number
	 */
	public static String getPhoneNumber() {
		return faker.phoneNumber().phoneNumber()
	}

	/**
	 * Generate a fake street address name
	 * @return A random street address name
	 */
	public static String getAddressStreet() {
		return faker.address().streetAddress()
	}

	/**
	 * Generate a fake city name
	 * @return A random city name
	 */
	public static String getAddressCity() {
		return faker.address().city()
	}

	/**
	 * Generate a fake state name
	 * @return A random state name
	 */
	public static String getAddressState() {
		return faker.address().state()
	}

	/**
	 * Generate a fake ZIP code
	 * @return a Random ZIP code
	 */
	public static String getAddressZipCode() {
		return faker.address().zipCode()
	}

	/**
	 * Generate a fake phone number
	 * @return a Random phone number
	 */
	public static String getPhone() {
		return faker.phoneNumber().phoneNumber()
	}

	/**
	 * Generate a fake SSN
	 * @return A random SSN in the format XXX-XX-XXXX
	 */
	public static String getSSNValid() {
		// Generate a valid SSN in the format XXX-XX-XXXX
		String ssn = String.format("%03d-%02d-%04d",
				faker.number().numberBetween(100, 999),
				faker.number().numberBetween(10, 99),
				faker.number().numberBetween(1000, 9999))
		return ssn
	}

	/**
	 * Generate a username
	 * @return A random username
	 */
	public static String getUsername() {
		return faker.name().username()
	}

	/**
	 * Generate a Password
	 * @return A random Password
	 */
	public static String getPassword() {
		return faker.internet().password()
	}
}
