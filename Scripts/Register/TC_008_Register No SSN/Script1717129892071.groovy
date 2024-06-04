import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static utils.FakerUtils.*
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String firstName = getFirstName()

String lastName = getLastName()

String addressStreet = getAddressStreet()

String addressCity = getAddressCity()

String addressState = getAddressState()

String addressZip = getAddressZipCode()

String phoneNumber = getPhone()

//String ssnValid = getSSNValid()
String usernameAccount = getUsername()

String passwordAccount = getPassword()

//WebUI.openBrowser(GlobalVariable.url)
//
//WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ParaBank-Welcome/p_Experience the difference'), 1)

WebUI.click(findTestObject('Object Repository/Page_ParaBank-Welcome/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_First Name_customer.firstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Last Name_customer.lastName'), lastName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Address_customer.address.street'), addressStreet)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_City_customer.address.city'), addressCity)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_State_customer.address.state'), addressState)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Zip Code_customer.address.zipCode'), addressZip)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Phone_customer.phoneNumber'), phoneNumber)

//WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_SSN_customer.ssn'), ssnValid)
WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Username_customer.username'), usernameAccount)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Password_customer.password'), passwordAccount)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Register/input_Confirm_repeatedPassword'), passwordAccount)

WebUI.click(findTestObject('Object Repository/Page_ParaBank-Register/input_Confirm_button'))

/*
 * WebUI.verifyElementText(findTestObject('Object
 * Repository/Page_ParaBank-Customer-Logged-In/h1_Welcome'), 'Welcome ' +
 * usernameAccount)
 * 
 * WebUI.verifyElementText(findTestObject('Object
 * Repository/Page_ParaBank-Customer-Logged-In/p_Welcome'), (('Welcome ' +
 * firstName) + ' ') + lastName)
 */
WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank-Register/span_Alert', [('forms') : 'ssn']), 'Social Security Number is required.')

WebUI.takeFullPageScreenshotAsCheckpoint('ssnRequired')