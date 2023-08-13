import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.comment('User should able to search the quote in Portal')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

String subNum = SubmissionNumber

if (subNum.contains('Submission')) {
    subNum = subNum.replace('Submission ', '')
} else if (subNum.contains('Rewrite')) {
    subNum = subNum.replace('Rewrite ', '')
} else if (subNum.contains('Policy Change')) {
    subNum = subNum.replace('Policy Change ', '')
} else if (subNum.contains('Cancellation')) {
    subNum = subNum.replace('Cancellation ', '')
} else if (subNum.contains('Reinstatement')) {
    subNum = subNum.replace('Reinstatement ', '')
} else if (subNum.contains('Renewal')) {
    subNum = subNum.replace('Renewal ', '')
} else if (subNum.contains('Quote No.')) {
    subNum = subNum.replace('Quote No. ', '')
}

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Quote_TextBox_SearchFor'), subNum)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

SubmissionNumber = subNum

WebUI.takeFullPageScreenshot()

