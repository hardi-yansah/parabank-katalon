import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WS.getElementText('test', 'test', FailureHandling.CONTINUE_ON_FAILURE)
	
WebUI.setText(findTestObject(null), '')

Mobile.setText(findTestObject(null), '', 0)