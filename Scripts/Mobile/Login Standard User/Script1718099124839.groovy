import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('Application/Android-SauceLabs-2.7.1.apk', false)

Mobile.setText(findTestObject('Object Repository/mobileApp/android.widget.EditText - Username'), 'standard_user', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/mobileApp/android.widget.EditText - Password'), 'qcu24s4901FyWDTwXGr6XA==', 
    0)

Mobile.tap(findTestObject('Object Repository/mobileApp/android.view.ViewGroup - Login Button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/mobileApp/android.widget.TextView - PRODUCTS'), 1)

Mobile.verifyElementExist(findTestObject('Object Repository/mobileApp/android.widget.ImageView'), 1)

Mobile.takeScreenshotAsCheckpoint('loggedIn')

Mobile.closeApplication()