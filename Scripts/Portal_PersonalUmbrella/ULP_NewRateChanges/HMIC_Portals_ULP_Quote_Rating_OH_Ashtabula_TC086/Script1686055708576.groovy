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
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.eclipse.persistence.jpa.jpql.Assert as RandomStringUtils
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

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
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

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Input_EffDate'))

WebUI.sendKeys(findTestObject('Portal_ULP/Portal_PolicyInfo_Input_EffDate'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Portal_ULP/Portal_PolicyInfo_Input_EffDate'), '07/31/2023')

WebUI.click(findTestObject('Portal_ULP/Portal_PolicInfo_TypeList_County'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Select_County_WI_Milwaukee'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PolicyInfo_Occupation'), 'ENGINEER')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_PolicyInfo_InsuredsEmployer'), 'SAM JOSEPH')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyInfo_TypeList_VIPDiscount'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Portal_ULP/Portal_PolicyInfo_Select_VIPDiscount_Quantum'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyInfo_button_Next Primary Policy'))

WebUI.comment('Enter Primary Policy details')

WebUI.click(findTestObject('Portal_ULP/Portal_PrimaryPolicy_TypeList_TypeOfPolicy'))

WebUI.click(findTestObject('Portal_ULP/Portal_primaryPolicy_Select_TypeOfPolicy_Watercraft'))

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

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_NoOfResidences_RealEstate'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Exposures_input_OccupancyAndInterest'), 'OWNER')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Button_Save_RealEstate'))

WebUI.comment('Add Auto_1')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_CheckBox_Autos'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Radiobtn_UMUIM_Accept_Autos'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Radiobtn_UIM_Accept_Autos'), FailureHandling.OPTIONAL)

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

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Year_Autos_2020'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_TypeList_Make_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Make_Autos_AUDI'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Typelist_Model_Autos'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Select_Model_Autos_AUDI_A3 2.0T SPORT PREMIUM'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_Button_Save_Autos'))

WebUI.comment('Add Other Vehicle_SnowMobile')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Chkbox'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_TypeList_YEAR'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicle_Select_Year_div_1951'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicle_Select_Year_div_1951'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Typelist_TYPE'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Select_Snowmobile'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Select_Snowmobile'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_MAKE'), 'SWIFT')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_MODEL'), 'ZXI')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_EngSize'), '300')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_btn_SAVE'))

WebUI.comment('Add Other Vehicle_MotorHome')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_btn_AddOtherVeh'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_TypeList_YEAR'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles2_Select_1951_Year'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles2_Select_1951_Year'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Typelist_TYPE'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Select_Motorhome'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Select_Motorhome'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_MAKE'), 'FORD')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_MODEL'), 'VXI')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_btn_SAVE'))

WebUI.comment('Add Other Vehicle_MotorCycle')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_btn_AddOtherVeh'))

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_TypeList_YEAR'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_TypeList_YEAR'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicle3_Select_Year_1951'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicle3_Select_Year_1951'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Typelist_TYPE'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Select_Motorcycle'))

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Select_Motorcycle'))

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_MAKE'), 'ROVER')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_MODEL'), 'GST')

WebUI.setText(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_Txtfield_EngSize'), '200')

WebUI.click(findTestObject('Portal_ULP/Portal_Exposures_OtherVehicles_btn_SAVE'))

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

WebUI.click(findTestObject('Object Repository/Portal/Portal_Exposures_Button_Next General Information'))

WebUI.comment('Enter General Information')

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_chkbox_SwimPool'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_radbtn_TypeOfPool_Swimpool'))

WebUI.click(findTestObject('Portal_ULP/Portal_GeneralInfo_radbtn_Fenced_Swimpool'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_GeneralInfo_btn_NextQuote'))

WebUI.comment('Validate Quote Information')

List<Integer> residencesData = new ArrayList<Integer>()

List<Integer> autosData = new ArrayList<Integer>()

List<Integer> countyData = new ArrayList<Integer>()

List<Integer> antiqueData = new ArrayList<Integer>()

residencesData = CustomKeywords.'myPack.Portal_ULP_Utility.getCoverageInfo'('Residences')

autosData = CustomKeywords.'myPack.Portal_ULP_Utility.getCoverageInfo'('Autos')

countyData = CustomKeywords.'myPack.Portal_ULP_Utility.getCoverageInfo'('Hamilton')

antiqueData = CustomKeywords.'myPack.Portal_ULP_Utility.getCoverageInfo'('Antique')

boolean status

status = CustomKeywords.'myPack.Portal_ULP_Utility.checkResidencePremium'(residencesData)

Assert.assertTrue(status, 'Residences Premium has been calculated accurately')

status = CustomKeywords.'myPack.Portal_ULP_Utility.checkAutoPremium'(autosData)

Assert.assertTrue(status, 'Autos Premium has been calculated accurately')

status = CustomKeywords.'myPack.Portal_ULP_Utility.checkOHCountyPremium'(countyData, 'Ashtabula')

Assert.assertTrue(status, 'County Premium has been calculated accurately')

status = CustomKeywords.'myPack.Portal_ULP_Utility.checkAntiqueAutoPremium'(antiqueData)

Assert.assertTrue(status, 'Antique Auto Premium has been calculated accurately')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_QuotePage_Button_ProceedAsNewBusiness'))

WebUI.comment('Enter Complete Application Information ')

WebUI.takeFullPageScreenshot()

