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

not_run: Mobile.tap(findTestObject('Object Repository/OR Scrool/android.widget.TextView - Send Money'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/OR Scrool/android.widget.TextView - Bank Transfer'), 0)

not_run: CustomKeywords.'swiprePac.Scroll.horizontalScroll'(findTestObject('Object Repository/Test_swipe_More/Miniapp Grid'), 
    findTestObject('Object Repository/Test_swipe_More/Kitchen Cuisine'))

not_run: Mobile.tap(findTestObject('OR Scrool/android.widget.TextView - Tohfa'), 10)

not_run: Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Discover MiniApps on easypaisa', FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'swiprePac.Scroll.horizontalScroll'(findTestObject('Test_swipe_More/Miniapp Grid'), findTestObject('Object Repository/Test_swipe_More/Kitchen Cuisine'))
CustomKeywords.'swiprePac.Scroll.horizontalScroll'(findTestObject('Test_swipe_More/Miniapp Grid'), findTestObject('Object Repository/Test_swipe_More/Whites Castle'))

Mobile.tap(findTestObject('Test_swipe_More/Whites Castle'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

