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

not_run: WebUI.mouseOver(findTestObject('Portal_ULP/Portal_AccInfo_ProducerTypeList_0010-NiPerry'))

WebUI.click(findTestObject('Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_AcctInfo_Button_AddAccount'))

WebUI.waitForPageLoad(10)

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal_ULP/Portal_AccInfo_NewAccountCreated_Label_AccountNum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_AccInfo_NewAcctCreated_Button_Continue'))

WebUI.comment('Enter Policy Information')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_TypeList_PolicyLimit'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_Select_PolicyLimit'))

WebUI.click(findTestObject('Portal_ULP/Portal_PolicInfo_TypeList_County'))

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Select_County_IL_Cook'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_Occupation'), 'ENGINEER')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_InsuredsEmployer'), 'SAM JOSEPH')

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_TypeList_VIPDiscount'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_Select_VIPDiscount_Apex'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PolicyInfo_button_Next Primary Policy'))

WebUI.comment('Enter Primary Policy details')

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_TypeList_TypeOfPolicy'))

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_Select_TypeOfPolicy_EmpLiability'))

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_CompanyName'), 'SAM AGENCIES')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_input_BI_Acc_LimitPerPerson'), '100000')

WebUI.setText(findTestObject('Object Repository/Portal_ULP/Portal_PrimaryPolicy_input_BI_Acc_LimitPerAccident'), '50000')

WebUI.setText(findTestObject('Portal_ULP/Portal_PrimaryPolicy_input_BI_Disease_PerPerson'), '100000')

WebUI.setText(findTestObject('Portal_ULP/Portal_PrimaryPolicy_input_BI_Disease_PerAccident'), '50000')

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

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal_ULP/Portal_Exposures_Button_Next General Information'))

WebUI.comment('Enter General Information')

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_chkbox_SwimPool'))

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_radbtn_TypeOfPool_Swimpool'))

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_radbtn_Fenced_Swimpool'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_btn_NextQuote'))

WebUI.comment('Validate Quote Information')

List<WebElement> tableData = new ArrayList<String>()

tableData = CustomKeywords.'myPack.Portal_ULP_Utility.getCoverageInfo'('Discount')

println(tableData.toString())

//tableData = WebUI.callTestCase(findTestCase('Portal_PersonalUmbrella/ULP_NewRateChanges/Portal_QuotePage_ULP_PremiumValidation'), [:], FailureHandling.STOP_ON_FAILURE)
/*tableData = WebUI.callTestCase(findTestCase('Portal_PersonalUmbrella/Portal_CommonScreens/Portal_Quote_ULP_ParameterCall_PremValid'), 
    [('') : 'Limit of Liability'], FailureHandling.STOP_ON_FAILURE)
   println(tableData.toString())
    */
String county = WebUI.getText(findTestObject('Portal_ULP/Portal_Quote_PremDet_GetText_County'), FailureHandling.STOP_ON_FAILURE)

boolean flag = false

if (county.contains('Cook County')) {
    flag = true

    WebUI.comment('County has been displayed correctly')
}

Assert.assertTrue(flag, 'County has been displayed correctly')

countyPrem = WebUI.getText(findTestObject('Portal_ULP/Portal_Quote_PremDetails_County_premium'))

boolean flag1 = false

if (countyPrem.equals(GlobalVariable.Cook_County_Premium)) {
    flag1 = true

    WebUI.comment('County Premium has been displayed correctly')
}

Assert.assertTrue(flag1, 'County Premium has been displayed correctly')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_QuotePage_Button_ProceedAsNewBusiness'))

WebUI.comment('Enter Complete Application Information ')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_CompleteApplication_Button_NextPayment'))

WebUI.comment('Enter Payment Details')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Radbtn_PayPlans_SemiAnnual'))

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_AddNewPaymentMethod'))

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_radbtn_BankAcct_PaymentMthd'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_TextBox_Routing_BankAcct'))

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('Portal_ULP/Portal_Payment_TextBox_Routing_BankAcct'), Keys.chord('072404320'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_TextBox_AcctNum_BankAcct'), '123456700')

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_TextBox_ConfirmAcctNum_BankAcct'), '123456700')

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_Save_BankAcct'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Payment_btn_SavedPaymentMthd'))

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_SavedPaymentMthd'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_input_AgentContactName'), 'Tom Curran')

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_input_AgentContactEmail'), 'vmoturi@hastingsmutual.com')

WebUI.setText(findTestObject('Portal_ULP/Portal_Payment_input_AgentPhoneNumber'), '+1 (800) 555-5555')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_Button_Submit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Payment_btn_SubmitPayment_PlzConfirm_Popup'))

WebUI.takeFullPageScreenshot()

GlobalVariable.PolicyNumber = WebUI.getText(findTestObject('Portal_ULP/Portal_SubSuccess_Label_PolicyNum'))

