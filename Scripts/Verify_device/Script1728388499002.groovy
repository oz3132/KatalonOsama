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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.1.226:8090/TPOTA/APanel/login.aspx?url')

WebUI.setText(findTestObject('Object Repository/Verify_device/Page_TELENOR-Login/input_1_txtUser'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Verify_device/Page_TELENOR-Login/input_You can introduce just alphabetical c_d62a70'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(findTestObject('Login/Page_TELENOR-Login/input_Please provide password_btnSubmit'))

WebUI.click(findTestObject('Object Repository/Verify_device/Page_TELENOR-Devices/td_TP-PRO-91469'))

WebUI.click(findTestObject('Object Repository/Verify_device/Page_TELENOR-Devices/a_Logout'))

WebUI.closeBrowser()

