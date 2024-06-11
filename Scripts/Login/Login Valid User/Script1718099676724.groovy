import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_ParaBank-Welcome/input_Username_username'), 'hardi')

WebUI.setMaskedText(findTestObject('Object Repository/Page_ParaBank-Welcome/input_Password_password'), 'hardi123')

WebUI.click(findTestObject('Object Repository/Page_ParaBank-Welcome/input_Password_button'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank-Customer-Logged-In/p_Welcome'), 'Welcome hardi yansah')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ParaBank-Customer-Logged-In/p_Welcome'), 1)

WebUI.takeFullPageScreenshotAsCheckpoint('customerLoggedIn')