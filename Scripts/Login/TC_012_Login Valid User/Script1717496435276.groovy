import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Welcome/input_Username_username'), 'hardi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank-Welcome/input_Password_password'), '3ZKxlw6VuJnz5SiT6psgRw==')

WebUI.click(findTestObject('Object Repository/Page_ParaBank-Welcome/input_Password_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank-Customer-Logged-In/p_Welcome'), 'Welcome hardi yansah')

WebUI.takeFullPageScreenshotAsCheckpoint('customerLoggedIn')

//WebUI.closeBrowser()