import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Assert
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
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : 'adminuser2059'
        , ('Portal_Password') : 'Hmic1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User is able to Initiate the quote successfully')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Portal/Portal_LOB_TypeList_PersonalUmbrella'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_Next'))

WebUI.comment('NewAccount creation')

WebUI.click(findTestObject('Portal/Portal_AccInfo_TypeList_Individual'))

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'LastName' + org.apache.commons.lang.RandomStringUtils.randomAlphabetic(
        5))

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_ZipCode'), ZipCode)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_AccInfo_Button_CreateNewAcc'))

WebUI.comment('Enter Account Information')

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_Dropdwon_Prefix'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_AccInfo_TypeList_Prefix'))

WebUI.setText(findTestObject('Portal_ULP/Portal_AccInfo_TextBox_Address'), Address)

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('Portal_ULP/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_TypeList_ILState_1stAddress'))

WebUI.waitForPageLoad(10)

String zip = WebUI.getAttribute(findTestObject('Portal_ULP/Portal_AccInfo_GetText_ZipCode'), 'value')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_AcctInfo_Dropdown_ProducerCode'))

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_AccInfo_ProducerTypeList_0010-NiPerry'))

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_ProducerTypeList_0010-NiPerry'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_AcctInfo_Button_AddAccount'))

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_StandardizeAddress_Button_Continue'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal_ULP/Portal_AccInfo_NewAccountCreated_Label_AccountNum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_NewAcctCreated_Button_Continue'))

WebUI.comment('Enter Policy Information')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_TypeList_PolicyLimit'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_Select_PolicyLimit'))

WebUI.click(findTestObject('Portal_ULP/Portal_PolicInfo_TypeList_County'))

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Select_County_IA_Polk'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_Occupation'), 'ENGINEER')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_InsuredsEmployer'), 'SAM JOSEPH')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_TypeList_VIPDiscount'))

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Select_VIPDiscount_Quantum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_button_Next Primary Policy'))

WebUI.comment('Enter Primary Policy details_ComprehensivePL')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_TypeList_TypeOfPolicy'))

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_Select_TypeOfPolicy_Comprehensive Personal Liability'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_CompanyName'), 'SAM AGENCIES')

WebUI.setText(findTestObject('Portal_ULP/Portal_PrimaryPolicy_input_CombinedSingleLimit'), '100000')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PrimaryPolicy_button_Save'))

WebUI.comment('Enter Primary Policy details_Other')

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_button_AddPolicy'))

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_TypeList_TypeOfPolicy'))

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_Select_TypeOfPolicy_Other'))

WebUI.setText(findTestObject('Portal_ULP/Portal_PrimaryPolicy_input_OtherPolicyType'), 'GeneralLiability')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_CompanyName'), 'SAM AGENCIES')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_input_BI_Acc_LimitPerPerson'), '100000')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_input_BI_Acc_LimitPerAccident'), '50000')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_input_PropertyDamage'), '25000')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_button_NextExposures'))

WebUI.comment('Enter Exposure Information')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_CheckBox_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_TextBox_RealEstate_Address'), Address)

WebUI.sendKeys(findTestObject('Portal_ULP/Portal_Exposures_TextBox_RealEstate_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_RealEstate_1st Address'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_NoOfResidences_RealEstate'))

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_input_OccupancyAndInterest'), 'OWNER')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Button_Save_RealEstate'))

WebUI.comment('Add another location-2')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_btn_RealEstate_AddLocation'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_TextBox_RealEstate_Address'), '4224 N Prospect Dr')

WebUI.sendKeys(findTestObject('Portal_ULP/Portal_Exposures_TextBox_RealEstate_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_RealEstate_1st Address'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_NoOfResidences_RealEstate'))

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_input_OccupancyAndInterest'), 'OWNER')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Button_Save_RealEstate'))

WebUI.comment('Add another location-3')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_btn_RealEstate_AddLocation'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_TextBox_RealEstate_Address'), '2225 W Market St')

WebUI.sendKeys(findTestObject('Portal_ULP/Portal_Exposures_TextBox_RealEstate_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_RealEstate_1st Address'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_NoOfResidences_RealEstate'))

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_input_OccupancyAndInterest'), 'OWNER')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Button_Save_RealEstate'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_CheckBox_Autos'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Radiobtn_UMUIM_Accept_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Radiobtn_UIM_Accept_Autos'))

WebUI.waitForPageLoad(5)

WebUI.mouseOver(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_TypeList_Year_Autos'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_TypeList_Year_Autos'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_Select_Year_Autos'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Year_Autos'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Make_Autos'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Make_Autos'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Select_Make_Autos'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Typelist_Model_Autos'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Typelist_Model_Autos'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Select_Model_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Select_Model_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Button_Save_Autos'))

WebUI.comment('Add Watercraft')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Chkbox_Watercraft'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_TypeList_Year'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_Select_Year_1954'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_TypeList_Type'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_Select_Type_InBoard'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_input_Manufacturer'), 'FORD')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_input_Model'), 'ECOSPORT')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_input_Length'), '25')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_input_Horsepower'), '500')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_input_MaxSpeed'), '60')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_input_WatersNavigated'), 'LAKE MICHIGAN')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Watercraft_button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Button_Next General Information'))

WebUI.comment('Enter General Information_Violation1')

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_Chckbox_TrafficViolation'))

WebUI.setText(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_FirstName'), 'SAM')

WebUI.setText(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_LastName'), 'JOSEPH')

WebUI.setText(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_ViolationReason'), 'OVERSPEEDING')

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_Save'))

WebUI.comment('Enter General Information_Violation2')

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_button_AddDriverViolation'))

WebUI.setText(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_FirstName'), 'JOHN')

WebUI.setText(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_LastName'), 'WESLEY')

WebUI.setText(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_ViolationReason'), 'SIGNAL JUMP')

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_Input_TrafficViolation_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_btn_NextQuote'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_QuotePage_Button_ProceedAsNewBusiness'))

WebUI.comment('Enter Complete Application Information ')

WebUI.click(findTestObject('Portal_ULP/Portal_CompleteApplication_Chckbox_LossHistory'))

WebUI.click(findTestObject('Portal_ULP/Portal_CompleteApplication_input_DateOfLoss_LossHistory'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Portal_ULP/Portal_CompleteApplication_input_DateOfLoss_LossHistory'), '01/01/2021')

WebUI.click(findTestObject('Portal_ULP/Portal_CompleteApplication_input_Description_LossHistory'))

WebUI.setText(findTestObject('Portal_ULP/Portal_CompleteApplication_input_Description_LossHistory'), 'DAMAGE TO AUTO')

WebUI.click(findTestObject('Portal_ULP/Portal_CompleteApplication_button_Save_LossHistory'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_CompleteApplication_Button_NextPayment'))

WebUI.comment('Enter Payment Details')

WebUI.click(findTestObject('Portal_ULP/Portal_Payments_TypeList_BillingMethod'))

WebUI.click(findTestObject('Portal_ULP/Portal_Payments_BillingMethod_Select_Agency'))

WebUI.click(findTestObject('Portal_ULP/Portal_Payments_PayPlan_Radiobtn_Agency_FullPay'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_input_AgentContactName'), 'Tom Curran')

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_input_AgentContactEmail'), 'vmoturi@hastingsmutual.com')

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_input_AgentPhoneNumber'), '+1 (800) 555-5555')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Button_Submit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_SubmitPayment_PlzConfirm_Popup'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

GlobalVariable.PolicyNumber = WebUI.getText(findTestObject('Portal_ULP/Portal_SubSuccess_Label_PolicyNum'))

