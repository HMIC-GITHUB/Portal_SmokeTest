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

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_CreateAccount'), [('Address1') : Address1, ('City') : City
        , ('AddressType') : AddressType, ('AgencyName') : AgencyName, ('ProducerCode') : ProducerCode, ('ZipCode') : ZipCode
        , ('State') : State, ('TCName') : TCName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

LOB = WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_InitiateSubmission'), [('State') : State, ('LOB') : LOB
        , ('TCName') : TCName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_PolicyInfo'), [('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Locations')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_Locations'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'State Coverages')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_StateCoverages'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Line Coverages')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Supplemental')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_Supplemental'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'WC Options')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects (1)/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Policy Review')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Common_Quote'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysis_HandleUWIssues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

