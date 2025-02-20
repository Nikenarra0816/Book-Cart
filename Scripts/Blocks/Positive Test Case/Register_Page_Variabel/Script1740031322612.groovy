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

WebUI.setText(findTestObject('OR-Authentication/OR-Register/input_first name'), first_name)

WebUI.setText(findTestObject('OR-Authentication/OR-Register/input_last name'), last_name)

WebUI.setText(findTestObject('OR-Authentication/OR-Register/input_username'), username)

WebUI.setEncryptedText(findTestObject('OR-Authentication/OR-Register/input_password'), password)

WebUI.setEncryptedText(findTestObject('OR-Authentication/OR-Register/input_confirm_password'), password)

WebUI.click(findTestObject('OR-Authentication/OR-Register/input_gender_male'))

// Input Gender
select_radio = ''

switch (select_radio) {
    case select_radio = 'Male':
        WebUI.click(findTestObject('OR-Authentication/OR-Register/input_gender_male'))

        break
    case select_radio = 'Female':
        WebUI.click(findTestObject('OR-Authentication/OR-Register/input_gender_female'))

        break
    default:
        WebUI.click(findTestObject('OR-Authentication/OR-Register/input_gender_female'))}

// Menunggu agar tombol Register (span) dapat diklik
WebUI.waitForElementClickable(findTestObject('OR-Authentication/OR-Register/button_register'), 10)

WebUI.click(findTestObject('OR-Authentication/OR-Register/button_register'))

// Tunggu halaman login muncul
WebUI.waitForElementVisible(findTestObject('OR-Authentication/OR-Login/title_Login'), 10)

// Verifikasi bahwa halaman login terlihat
WebUI.verifyElementVisible(findTestObject('OR-Authentication/OR-Login/title_Login'), FailureHandling.OPTIONAL)

