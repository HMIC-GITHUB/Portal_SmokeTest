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

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_Common_Button_Quote'))

TitleName = WebUI.getText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'))

WebUI.waitForPageLoad(60)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.waitForPageLoad(120, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

TitleName = WebUI.getText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'))

if (TitleName.equals('Quote')) {
    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.refresh()

    WebUI.waitForPageLoad(120, FailureHandling.OPTIONAL)
}

TitleName = WebUI.getText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'))

if (TitleName.equals('Quote')) {
    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.refresh()

    WebUI.waitForPageLoad(200, FailureHandling.OPTIONAL)
}

TitleName = WebUI.getText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'))

if (!(TitleName.equals('Quote'))) {
	
	WebUI.waitForPageLoad(200, FailureHandling.OPTIONAL)
}

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Quote')

GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_TransactionNameAndStatus'))

WebUI.takeFullPageScreenshot()