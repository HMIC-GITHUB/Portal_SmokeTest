import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

if (TitleName.contains('Risk Analysis')) {
    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

    boolean eleSpecialApprove = false

    eleSpecialApprove = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'), 
        5, FailureHandling.OPTIONAL)

    if (eleSpecialApprove.equals(true)) {
        List<TestObjectProperty> specialApproveButton = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'), 
            30)

        specialApproveSize = specialApproveButton.size()

        for (int i = 0; i < specialApproveSize; i++) {
            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'))

            WebUI.acceptAlert()

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

            WebUI.waitForElementVisible(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'), 
                30)

            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_OK'))

        }
    }
	
	boolean eleApprove = false
    
    eleApprove = WebUI.verifyElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'), 
        5, FailureHandling.OPTIONAL)

    if (eleApprove.equals(true)) {
        List<TestObjectProperty> approveButton = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'), 
            30)

        approveSize = approveButton.size()

        for (int i = 0; i < approveSize; i++) {
            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'))

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_OK'))
        }
    }
}

WebUI.takeFullPageScreenshot()