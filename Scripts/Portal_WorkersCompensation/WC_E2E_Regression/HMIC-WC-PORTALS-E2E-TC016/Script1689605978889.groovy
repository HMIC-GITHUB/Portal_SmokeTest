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

WebUI.comment('HMIC-WC-PORTALS-E2E-TC016')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User is able to Initiate the quote successfully')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LOB_TypeList_WorkersComp'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_Next'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification')

WebUI.comment('Prequalification statement should be displayed.')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Agree'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information', 
    10)

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

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 'Add a New Account')

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), 'Illinois 83, Antioch, IL, USA')

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_StandardizeAddress_Button_Continue'))

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal/Portal_NewAccountCreated_Label_AccountNum'))

0 == 0

WebUI.click(findTestObject('Portal/Portal_NewAccountCreated_Button_Continue'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails_Operations/Page_Policy Details/Portal_PolicyDetails_Operations_dropdown'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails_Operations/Page_Policy Details/Portal_PolicyDetails_Operations_Selection'))

WebUI.click(findTestObject('PORTAL_POLICY DETAILS/Page_Policy Details/Portal_PolicyDetails_EntityType_Dropdown1'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Page_Policy Details/Portal_PolicyDetails_Entity_TypeList_Individual'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), Keys.chord('123456789'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_Button_Save'))

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

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages')

WebUI.click(findTestObject('Portal/Portal_StateCov_Checkbox_ContractingClassAdj'))

WebUI.click(findTestObject('Portal/Portal_StateCov_TypeList_ContractingClassAdj'))

WebUI.click(findTestObject('Portal/Portal_StateCov_Select_Credit_5_ContractingClassAdj'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote')

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'), 30)

GlobalVariable.SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Quote_Button_NextAdditionalInfo'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info')

WebUI.setText(findTestObject('Portal/Portal_AddInfo_TextArea_DescriptionOfOp'), 'Individual')

WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_FirstName'), 'AccAndIns_FirstName')

WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

WebUI.sendKeys(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'), Keys.chord('8567123411'))

WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'))

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Test')

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'Person')

WebUI.setText(findTestObject('Portal/Portal_FirstCall_TextBox_EmailAddress'), 'klella@hastingsmutual.com')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextReview'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

not_run: WebUI.mouseOver(findTestObject('Portal/Portal_Review_Button_SubmitToUnderwriting'))

not_run: WebUI.click(findTestObject('Portal/Portal_Review_Button_SubmitToUnderwriting'))

not_run: WebUI.verifyElementVisible(findTestObject('Portal/Portal_Popup_Label_QuoteConfirmation'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Portal/Portal_QuoteConfirmPopup_Button_OK'))

WebUI.comment('User should be able to quote the submission in Portal')

String SubmissionNumber = GlobalVariable.SubmissionNumber

WebUI.takeFullPageScreenshot()

WebUI.comment('Login to PC and approve UW issues')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.SubmissionNumber = SubmissionNumber.replace('Quote No. ', '')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

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

WebUI.click(findTestObject('Portal/Portal_Payment_Select_BillingMethod_Automatic'))

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_PaymentPlan_Radio_Monthly'))

WebUI.click(findTestObject('Portal/Portal_Payment_PaymentPlan_Radio_Monthly'))

WebUI.click(findTestObject('PORTAL_PAYMENT/Page_HMIC Agency Portal - Workers Compensation - Payment/Portal_Payments_Insured_Button_Add New Payment Method'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_CreditCardNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_CreditCardNumber'), '5499740000000057')

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_CreditCard_ExpDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_CreditCard_ExpDate'), '01/30')

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_CreditCard_CVV'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_CreditCard_CVV'), '231')

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_CreditCard_ZipCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_CreditCard_ZipCode'), '49805')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_CreditCard_SAVE'))

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('Portal/Portal_Payment_Select_CreditCard_SavedPaymentMethod'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PORTAL_PAYMENT/Page_HMIC Agency Portal - Workers Compensation - Payment/Portal_Payments_Auto_PaymentMethod_Downpayments_Add Payment Method_Selection'))

WebUI.click(findTestObject('PORTAL_PAYMENT/Page_HMIC Agency Portal - Workers Compensation - Payment/Portal_Payments_Auto_PaymentMethod_Savedpayments_Add Payment Method_Selection'))

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), 'AgentName')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactEmail'), 'klella@hastingsmutual.com')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentPhoneNum'), '8567123411')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_Submit'))

WebUI.click(findTestObject('Portal/Portal_Payment_Button_PleaseConfirmPopUp_SubmitPayment'))

String polNum = WebUI.getText(findTestObject('Portal/Portal_SubSuccess_Label_PolNum'))

GlobalVariable.PolicyNumber = polNum.replace('Policy No. ', '')

WebUI.comment('Policy issued successfully in Portal')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_UserDropdown_Button_Arrow'))

WebUI.click(findTestObject('Portal/Portal_UserDropdown_TypeList_LogOut'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

