import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import internal.GlobalVariable as Keys
import org.openqa.selenium.Keys as Keys
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

WebUI.comment('HMIC-WC-PORTALS-E2E-TC015')

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

WebUI.waitForPageLoad(5)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('User should able to search the quote in Portal')

WebUI.click(findTestObject('Portal/Portal_Common_Tab_Quote'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Quote_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

String subNum = GlobalVariable.SubmissionNumber

if (subNum.contains('Submission')) {
    subNum = subNum.replace('Submission ', '')
}

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : subNum]))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification', 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.comment('Prequalification statement should be displayed.')

WebUI.mouseOver(findTestObject('Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Portal/Portal_PreQual_Button_Disagree'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Quote_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Search not found message should be displayed')

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Portal/Portal_Quote_Button_Search'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Portal/Portal_Common_Tab_Policies'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Portal/Portal_Common_Tab_Quote'))

WebUI.waitForElementClickable(findTestObject('Portal/Portal_Quote_Title_StartANewBusiness'), 30)

WebUI.click(findTestObject('Portal/Portal_Quote_Title_StartANewBusiness'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Portal/Portal_LOB_TypeList_WorkersComp'))

WebUI.click(findTestObject('Portal/Portal_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification')

WebUI.click(findTestObject('Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Portal/Portal_PreQual_Button_Agree'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information')

WebUI.comment('User successfully navigated to Account Information screen')

WebUI.click(findTestObject('Portal/Portal_NewAccount_TypeList_SearchOrQuoteFor'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_NewAccount_Select_AcountNumber'))

WebUI.setText(findTestObject('Portal/Portal_NewAccount_input_AccountNumber'), GlobalVariable.AccountNumber)

WebUI.click(findTestObject('Portal/Portal_NewAccount_button_Search_AcountNumber'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_WorkClassification'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_WorkClassification_TypeList_0005'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '5000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

WebUI.comment('Adding State Coverages')

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages')

WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.comment('Adding Line Coverage')

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.comment('SupplementalQuestions')

WebUI.click(findTestObject('Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

WebUI.comment('QuoteInformation')

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote')

WebUI.getText(findTestObject('Portal/Portal_Quote_label_QuoteVersion'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'), 30)

GlobalVariable.SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Quote_Button_NextAdditionalInfo'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info')

WebUI.setText(findTestObject('Portal/Portal_AddInfo_TextArea_DescriptionOfOp'), 'Individual')

WebUI.click(findTestObject('Portal/Portal_AccAndinsCont_button_EditIcon'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'), Keys.chord('8567123411'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Test')

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'Person')

WebUI.setText(findTestObject('Portal/Portal_FirstCall_TextBox_EmailAddress'), 'ssomasundaram@hastingsmutual.com')

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_IL_BureauID'), '917656543')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextReview'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.comment('User should be able to quote the submission in Portal')

String SubmissionNumber = GlobalVariable.SubmissionNumber

WebUI.takeFullPageScreenshot()

WebUI.comment('Login to PC and approve UW issues')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.SubmissionNumber = SubmissionNumber.replace('Quote No. ', '')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenterObjects (1)/PC_Common_LeftPanel_RiskAnalysis'))

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysisScreen_ApproveUWIssues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User should able to search the quote in Portal')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Quote_TextBox_SearchFor'), GlobalVariable.SubmissionNumber)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : GlobalVariable.SubmissionNumber]))

WebUI.takeFullPageScreenshot()

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextPayment'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 9: Payment', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 9: Payment')

WebUI.click(findTestObject('Portal/Portal_Payment_TypeList_BillingMethod'))

WebUI.click(findTestObject('Portal/Portal_Payment_Select_Billingmethod_Agency'))

WebUI.verifyElementNotPresent(findTestObject('Portal/Portal_Payment_CheckBox_DeferDownPayment'), 0)

WebUI.verifyElementNotPresent(findTestObject('Portal/Portal_Payment_Radbtn_UseSamePaymentMethod'), 0)

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_Radbtn_PayPlans_SemiAnnual'))

WebUI.click(findTestObject('Portal/Portal_Payment_Radbtn_PayPlans_SemiAnnual'))

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), 'AgentName')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactEmail'), 'abc@gmail.com')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentPhoneNum'), '8567123411')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_Submit'))

WebUI.click(findTestObject('Portal/Portal_Payment_Button_PleaseConfirmPopUp_SubmitPayment'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Portal/Portal_SubSuccess_Label_ApplicationIssued'), 'This application has been issued. Please contact your underwriter with questions.')

String polNum = WebUI.getText(findTestObject('Portal/Portal_SubSuccess_Label_PolNum'))

GlobalVariable.PolicyNumber = polNum.replace('Policy No. ', '')

WebUI.comment('Policy issued successfully in Portal')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_UserDropdown_Button_Arrow'))

WebUI.click(findTestObject('Portal/Portal_UserDropdown_TypeList_LogOut'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

