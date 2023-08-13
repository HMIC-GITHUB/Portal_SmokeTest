import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_AccSummary_Button_Actions'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_AccSummary_ActionsTypeList_NewSubmission'))

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSubmissions_Dropdown_DefaultBaseState'), 
    State, false)

String lob = LOB

//select LOB
myTestObject = new TestObject('customObject')

List<TestObjectProperty> properties = new ArrayList<TestObjectProperty>()

if (lob.contains('Workers')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSubmissions_Button_LOB_Select_WC'))

    WebUI.waitForPageLoad(10)

    GlobalVariable.LOB = 'Workers\' Compensation'

    LOB = 'Workers\' Compensation'
} else {
    properties.add(new TestObjectProperty('xpath', ConditionType.EQUALS, "//td[contains(@id,'Name_Cell')]//div[text()='$LOB']/../../../../..//div[contains(@id,'addSubmission')]"))

    myTestObject.setProperties(properties)

    WebUI.click(myTestObject)

    WebUI.waitForPageLoad(10)

    GlobalVariable.LOB = LOB
}

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'), 'Submission (Draft)')

GlobalVariable.SubmissionNumber = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))

WebUI.takeFullPageScreenshot()

return LOB

