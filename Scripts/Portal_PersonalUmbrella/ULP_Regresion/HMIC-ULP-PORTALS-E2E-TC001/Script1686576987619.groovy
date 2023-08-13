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

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : 'adminuser2059'
        , ('Portal_Password') : 'Hmic1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User is able to Initiate the quote successfully')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LOB_TypeList_PersonalUmbrella'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_Next'))

WebUI.comment('NewAccount creation')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_Individual'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_ZipCode'), ZipCode)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_CreateNewAcc'))

WebUI.comment('Enter Account Information')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Dropdwon_Prefix'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_Prefix'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address (1)'), Address)

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address (1)'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_ILState_1stAddress'))

WebUI.waitForPageLoad(10)

String zip = WebUI.getAttribute(findTestObject('Object Repository/Portal/Portal_AccInfo_GetText_ZipCode'), 'value')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AcctInfo_Dropdown_ProducerCode'))

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_AccInfo_ProducerTypeList_0010-NiPerry'))

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_ProducerTypeList_0010-NiPerry'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AcctInfo_Button_AddAccount'))

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_StandardizeAddress_Button_Continue'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Object Repository/Portal/Portal_AccInfo_NewAccountCreated_Label_AccountNum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_NewAcctCreated_Button_Continue'))

WebUI.comment('Enter Policy Information')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyInfo_TypeList_PolicyLimit'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyInfo_Select_PolicyLimit'))

WebUI.comment('Add Named Insured')

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_btn_AddAnthrInsured'))

WebUI.setText(findTestObject('Portal_ULP/Portal_PolicyInfo_NameInsd_input_FrstName'), 'JOHN')

WebUI.setText(findTestObject('Portal_ULP/Portal_PolicyInfo_NameInsd_input_LastName'), 'WESLEY')

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_btn_Insured_Save'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PolicyInfo_Occupation'), 'ENGINEER')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PolicyInfo_InsuredsEmployer'), 'SAM JOSEPH')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyInfo_TypeList_VIPDiscount'))

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Select_VIPDiscount_Pinnacle'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyInfo_button_Next Primary Policy'))

WebUI.comment('Enter Primary Policy details')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_TypeList_TypeOfPolicy'))

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_Select_TypeOfPolicy_Auto Liability'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_CompanyName'), 'SAM AGENCIES')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_input_BI_Acc_LimitPerPerson'), '100000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_input_BI_Acc_LimitPerAccident'), '50000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_input_PropertyDamage'), '25000')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_button_NextExposures'))

WebUI.comment('Enter Exposure Information')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_CheckBox_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Exposures_TextBox_RealEstate_Address'), Address)

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_Exposures_TextBox_RealEstate_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_TypeList_RealEstate_1st Address'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_NoOfResidences_RealEstate'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Exposures_input_OccupancyAndInterest'), 'OWNER')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Button_Save_RealEstate'))

WebUI.comment('Add Auto_01')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_CheckBox_Autos'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Radiobtn_UMUIM_Accept_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Year_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Year_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Make_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Make_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Typelist_Model_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Model_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Button_Save_Autos'))

WebUI.comment('Add Auto_2')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_btn_AddAuto'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Year_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Year_Autos_2020'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Make_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Make_Autos_BMW'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Typelist_Model_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Model_Autos_BMW_330I XDRIVE'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Button_Save_Autos'))

WebUI.comment('Add Auto_3')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_btn_AddAuto'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Year_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Year_Autos_1981'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Make_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Make_Autos_AUDI'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Typelist_Model_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Model_Autos_Antique_4000'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_RadioBtn_Autos_IsAntique_YES'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Button_Save_Autos'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Button_Next General Information'))

WebUI.comment('Enter General Information')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_GeneralInfo_btn_NextQuote'))

WebUI.comment('Validate Quote Information')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_QuotePage_Button_ProceedAsNewBusiness'))

WebUI.comment('Enter Complete Application Information ')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_CompleteApplication_Button_NextPayment'))

WebUI.comment('Enter Payment Details')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Radbtn_PayPlans_Monthly'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Payment_btn_AddNewPaymentMethod'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_TextBox_CreditCardNumber'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_TextBox_CreditCardNumber'), '5499740000000057')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Textbox_CreditCardExpDate'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_Textbox_CreditCardExpDate'), '01/29')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_TextBox_CreditCardCVV'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_TextBox_CreditCardCVV'), '771')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Textbox_CreditCardZipCode'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_Textbox_CreditCardZipCode'), '43219')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Payment_btn_Save_BankAcct'))

WebUI.waitForPageLoad(20)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Payment_btn_SavedPaymentMthd'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_SavedPaymentMthd'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Payment_input_AgentContactName'), 'Tom Curran')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Payment_input_AgentContactEmail'), 'vmoturi@hastingsmutual.com')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Payment_input_AgentPhoneNumber'), '+1 (800) 555-5555')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_SavedPaymentMthd'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Button_Submit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Payment_btn_SubmitPayment_PlzConfirmPopUp_Authorize'))

WebUI.takeFullPageScreenshot()

GlobalVariable.PolicyNumber = WebUI.getText(findTestObject('Object Repository/Portal/Portal_SubSuccess_Label_PolicyNum'))

