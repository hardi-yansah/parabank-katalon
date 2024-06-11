import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('Application/Android-SauceLabs-2.7.1.apk', false)

Mobile.setText(findTestObject('Object Repository/mobileApp/android.widget.EditText - Username'), 'test', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/mobileApp/android.widget.EditText - Password'), 'P9ET2sDE0SE=', 
    0)

Mobile.tap(findTestObject('Object Repository/mobileApp/android.view.ViewGroup - Login Button'), 0)

/*
 * Mobile.verifyElementExist(findTestObject('Object
 * Repository/mobileApp/android.widget.TextView - PRODUCTS'), 1)
 * 
 * Mobile.verifyElementExist(findTestObject('Object
 * Repository/mobileApp/android.widget.ImageView'), 1)
 */
Mobile.verifyElementExist(findTestObject('Object Repository/mobileApp/android.view.ViewGroup - Alert', [('text') : 'Username and password do not match any user in this service.']), 
    1)

Mobile.takeScreenshotAsCheckpoint('invalidUser')

Mobile.closeApplication()