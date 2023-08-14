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

WebUI.verifyElementText(findTestObject('PolicyCenterObjects (1)/PC_Common_Label_Title'), 'Supplemental')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NatureOfBusinessOrDescriptionOfOperations'), 
    'Business')

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NatureOfBusinessOrDescriptionOfOperations'), 
    Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_DoesApplicantOwnOperateOrLeaseAircraftOrwatercraft'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_DoHavePastOrPresentOrDiscontinuedOps'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyWorkPerformedUnderOrAbove'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyWorkPerformedOnBargesVesselsDocksBridgeOverWater'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_IsApplicantEngagedInAnyOtherTypeOfBusiness'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AreSubContractorsUsed'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyWorkSubletWithoutCertificatesOfInsurance'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_IsAWrittenSafetyProgramInOp'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyGroupTransportationProvided'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyEmployeesUnder16OrOver60YearsOfAge'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnySeasonalEmployees'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_IsThereAnyVolunteerOrDonatedLabor'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyEmployeesWithPhysicalHandicaps'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_DoEmployeesTravelOutOfState'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AreAthleticTeamsSponsored'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_ArePhysicalsRequiredAfterOffersOfEmploymentAreMade'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyOtherInsuranceWithThisInsurer'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyPriorCoverageDeclinedOrCanceledOrNonrenewed'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AreEmployeeHealthPlansProvided'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_IsThereALaborInterchangeWithAnyOtherBusinessOrSubsidiary'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_DoYouLeaseEmployeesToOrFromOtherEmployers'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_DoAnyEmployeesPredominantlyWorkAtHome'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyTaxLiensOrBankruptcyWithinTheLast5Years'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_WC_Supplemental_Radio_No_AnyUndisputedAndUnpaidWorkersCompensationPremiumDue'))
