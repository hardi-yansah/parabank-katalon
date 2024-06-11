import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

WS.sendRequestAndVerify(findTestObject('JSON Dummy Placeholder/View Detail Post'))