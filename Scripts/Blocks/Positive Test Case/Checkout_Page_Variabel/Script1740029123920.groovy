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

WebUI.waitForElementClickable(findTestObject('OR-Checkout/button_checkout'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OR-Checkout/button_checkout'))

WebUI.waitForElementVisible(findTestObject('OR-Checkout/title_Checkout'), 0, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OR-Checkout/input_name'), name)

WebUI.setText(findTestObject('OR-Checkout/input_address1'), address1)

WebUI.setText(findTestObject('OR-Checkout/input_address2'), address2)

// Input pincode
WebUI.setText(findTestObject('OR-Checkout/input_pincode'), pincode)

String pincodeInput = WebUI.getAttribute(findTestObject('OR-Checkout/input_pincode'), 'value')

// Validasi pincode
if (((pincodeInput.length() == 6) && pincodeInput.matches('\\d{6}')) && !(pincodeInput.startsWith('0'))) {
    println('Pincode valid')
} else {
    println('Pincode tidak valid')

    TestObject errorMessageElement = findTestObject('OR-Checkout/error_message_pincode')

    if (WebUI.waitForElementPresent(errorMessageElement, 10)) {
        WebUI.verifyElementText(errorMessageElement, 'Pincode must have 6 digits only and cannot start with 0')
    } else {
        println('Error: Pesan error pincode tidak muncul di UI')
    }
}

WebUI.setText(findTestObject('OR-Checkout/input_state'), state)

WebUI.click(findTestObject('OR-Checkout/button_place_order'))

