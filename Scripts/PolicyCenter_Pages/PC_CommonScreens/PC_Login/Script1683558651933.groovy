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

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.takeFullPageScreenshot()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter_Login/div_PC_Login_Link_ClickHereToLogin'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter_Login/input_PC_Login_TextBox_UserName'), PC_Username)

WebUI.setText(findTestObject('Object Repository/PolicyCenter_Login/input_PC_Login_TextBox_Password'), PC_Password)

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('PolicyCenter_Login/input_PC_Login_Button_Login'), 20)

WebUI.click(findTestObject('Object Repository/PolicyCenter_Login/input_PC_Login_Button_Login'))

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 30)

WebUI.verifyElementVisible(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'))

WebUI.takeFullPageScreenshot()

