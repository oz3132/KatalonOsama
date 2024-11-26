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

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.RelativeLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/EasyPaisaTest/android.widget.RelativeLayout (3)'), 0)

Mobile.tap(findTestObject('EasyPaisaTest/android.widget.TextView - Enter Receivers Number or select from contacts'), 0)

Mobile.setText(findTestObject('Edit Test Reciever Number/android.widget.EditText - Enter Number or Search Contacts'), '03332020258', 
    0)

Mobile.tap(findTestObject('EasyPaisaback/AfterNumberTap'), 0)

Mobile.tap(findTestObject('EasyPaisaback/Account Not found- OK'), 0)

Mobile.tap(findTestObject('EasyPaisaback/Back After Account not found'), 0)

Mobile.tap(findTestObject('EasyPaisaback/Back On SendMoney'), 0)

Mobile.tap(findTestObject('EasyPaisaback/Tap On send Money to'), 0)

Mobile.closeApplication()

