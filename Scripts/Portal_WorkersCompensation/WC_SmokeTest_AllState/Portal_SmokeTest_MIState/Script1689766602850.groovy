import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

WebUI.comment('Portal Smoke Test')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User is able to Initiate the quote successfully')

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LOB_TypeList_WorkersComp'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_Next'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification')

WebUI.comment('Prequalification statement should be displayed.')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Agree'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information')

WebUI.comment('User successfully navigated to Account Information screen')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Dropdown_SearchOrQuoteFor'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_Individual'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

// + RandomStringUtils.randomAlphabetic(5)
WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_ZipCode'), '49058')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_CreateNewAcc'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 'Add a New Account')

//WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), '1618 W M 43 Hwy')

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

String strenv = GlobalVariable.PortalURL

if (strenv.contains('dev4')) {
    WebUI.comment('Dev4')

    WebUI.mouseOver(findTestObject('Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Dropdown_AgencyCode'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Dropdown_AgencyCode'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Select_AgencyCode'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Select_AgencyCode'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.mouseOver(findTestObject('Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Dropdown_ProducerCode'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Dropdown_ProducerCode'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Select_ProducerCode'))

    WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/Portal_AccInfo_Select_ProducerCode'))
} else {
    WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

    WebUI.click(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

    WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

    WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))
}

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_StandardizeAddress_Button_Continue'))

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal/Portal_NewAccountCreated_Label_AccountNum'))

WebUI.comment(GlobalVariable.AccountNumber)

println(GlobalVariable.AccountNumber)

WebUI.click(findTestObject('Portal/Portal_NewAccountCreated_Button_Continue'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyDetails_Dropdown_OrgType'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_OrgType_TypeList_Individual'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), Keys.chord('123456789'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_WorkClassification'), 10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_WorkClassification'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_WorkClassification_TypeList_0005'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '5000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 15, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages')

not_run: WebUI.click(findTestObject('Portal/Portal_StateCov_Chkbox_ExpRating'))

not_run: WebUI.click(findTestObject('Portal/Portal_StateCov_input_ExpRating'))

not_run: WebUI.setText(findTestObject('Portal/Portal_StateCov_input_ExpRating'), '1.22')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'), 10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

strTitle = WebUI.getText(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'))

if (strTitle == 'Step 4: Coverages') {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'), 10)

    WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Supplemental_CheckBox_IhaveReviewed'), 10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 15, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote')

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'), 30)

GlobalVariable.SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'))

println(GlobalVariable.SubmissionNumber)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Quote_Button_NextAdditionalInfo'))

WebUI.waitForElementPresent(findTestObject('Portal/Portal_Common_Label_Header'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info')

WebUI.setText(findTestObject('Portal/Portal_AddInfo_TextArea_DescriptionOfOp'), 'Individual')

WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_FirstName'), 'AccAndIns_FirstName')

WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

WebUI.sendKeys(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'), Keys.chord('8567123411'))

WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'))

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Test')

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'Person')

WebUI.setText(findTestObject('Portal/Portal_FirstCall_TextBox_EmailAddress'), 'ssomasundaram@hastingsmutual.com')

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_MI_BureauID'), '867567876')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextReview'))

WebUI.waitForElementPresent(findTestObject('Portal/Portal_Common_Label_Header'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.comment('User should be able to quote the submission in Portal')

String SubmissionNumber = GlobalVariable.SubmissionNumber

WebUI.takeFullPageScreenshot()

WebUI.comment('Login to PC and approve UW issues')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : GlobalVariable.PC_Username
        , ('PC_Password') : PC_Password], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.SubmissionNumber = SubmissionNumber.replace('Quote No. ', '')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_LeftPanel_RiskAnalysis'))

WebUI.waitForElementPresent(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 30)

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysisScreen_ApproveUWIssues'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_ReleaseLock'), 10, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_Button_ReleaseLock'), FailureHandling.OPTIONAL)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenterObjects (1)/PC_UWActivity_Dropdown_AssignTo'), 'Test Processor3 (Renewal Com Proc)', 
        false, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_UWActivity_Button_Release'), FailureHandling.OPTIONAL)
}

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User should able to search the quote in Portal')

WebUI.waitForElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Quote_TextBox_SearchFor'), GlobalVariable.SubmissionNumber)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : GlobalVariable.SubmissionNumber]))

WebUI.takeFullPageScreenshot()

WebUI.waitForElementPresent(findTestObject('Portal/Portal_Common_Label_Header'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextPayment'))

WebUI.waitForElementPresent(findTestObject('Portal/Portal_Common_Label_Header'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 9: Payment')

WebUI.verifyElementPresent(findTestObject('Portal/Portal_Payment_DirectBill_PaymentPlan_Radio_FullPay'), 10)

WebUI.click(findTestObject('Portal/Portal_Payment_DirectBill_PaymentPlan_Radio_FullPay'))

WebUI.click(findTestObject('Portal/Portal_Payment_CheckBox_DeferDownPayment'))

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), 'AgentName')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactEmail'), 'abc@gmail.com')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentPhoneNum'), '8567123411')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_Submit'))

not_run: WebUI.verifyElementText(findTestObject('Portal/Portal_SubSuccess_Label_ApplicationIssued'), 'This application has been issued. Please contact your underwriter with questions.')

WebUI.waitForElementPresent(findTestObject('Portal/Portal_SubSuccess_Label_PolNum'), 30)

String polNum = WebUI.getText(findTestObject('Portal/Portal_SubSuccess_Label_PolNum'))

GlobalVariable.PolicyNumber = polNum.replace('Policy No. ', '')

println(GlobalVariable.PolicyNumber)

WebUI.comment('Policy issued successfully in Portal')

WebUI.comment(GlobalVariable.PolicyNumber)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_UserDropdown_Button_Arrow'))

WebUI.click(findTestObject('Portal/Portal_UserDropdown_TypeList_LogOut'))

not_run: WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

