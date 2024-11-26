import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('pk.com.telenor.phoenix')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sign-in and Pin/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Sign-in and Pin/android.widget.EditText'), '54545', 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.RelativeLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.RelativeLayout (3)'), 0)

Mobile.tap(findTestObject('EasyPaisaTest/android.widget.TextView - Enter Receivers Number or select from contacts'), 0)

Mobile.setText(findTestObject('Edit Test Reciever Number/android.widget.EditText - Enter Number or Search Contacts'), '03166204200', 
    0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/EasyPaisaTest/android.widget.EditText - 0'), '10', 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.TextView - Send Now'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.ImageView (3)'), 0)

Mobile.closeApplication()

