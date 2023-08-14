import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Policy Info')

String lob = LOB

boolean flag = false

if (lob.contains(WebUI.getText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_LOB')))) {
    flag = true

    Assert.assertTrue(flag)
} else {
    WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_LOB', [(LOB) : LOB]), LOB)

    Assert.assertTrue(flag)
}

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_PolicyInfo_Button_CalenderButton'))

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_PolicyInfo_CalenderButton_Today'))

WebUI.setText(findTestObject('PolicyCenterObjects (1)/PC_PolicyInfo_TextBox_SSN'), '' + RandomStringUtils.randomNumeric(
        9))

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'))

WebUI.waitForPageLoad(10)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_PolicyInfo_Dropdown_LegalEntity'), 
    LegalEntity, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_PolicyInfo_Dropdown_TypeOfOperation'), 
    PolicyInfo_TypeOfOperation, true)

WebUI.takeFullPageScreenshot()

