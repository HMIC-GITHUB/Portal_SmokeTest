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

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_Button_AddClass'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_TextBox_ClassCode_N'), ClassCode1)

WebUI.sendKeys(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_TextBox_ClassCode_N'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_TextBox_FullTimeEmployees_N'), '10')

WebUI.sendKeys(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_TextBox_FullTimeEmployees_N'), Keys.chord(
        Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_TextBox_Exposure_N'), Exposure)

WebUI.sendKeys(findTestObject('PolicyCenterObjects (1)/PC_StateCoverages_TextBox_Exposure_N'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshot()

if (ScheduleModificationTypeOverride.equals('Credit')) {
    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_DropDown_ScheduleModificationTypeOverride'))

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_DropDown_ScheduleModificationTypeOverride'), 
        'Credit', true)

    WebUI.waitForPageLoad(20)

	WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_DropDown_ScheduleModificationOverride'), 
        '1', false)
}

