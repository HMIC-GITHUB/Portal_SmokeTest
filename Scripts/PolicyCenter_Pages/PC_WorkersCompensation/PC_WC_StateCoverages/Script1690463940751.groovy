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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State Coverages')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_StateID'), '' + RandomStringUtils.randomNumeric(
        9))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_Button_AddClass'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_ClassCode'), Classcode)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_ClassCode'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_FullTimeEmployees'), '10')

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_FullTimeEmployees'), Keys.chord(
        Keys.TAB))

WebUI.waitForPageLoad(10)

if (Exposure.equals('')) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_Exposure'), '25000')
} else {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_Exposure'), Exposure)
}

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StateCoverages_TextBox_Exposure'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshot()