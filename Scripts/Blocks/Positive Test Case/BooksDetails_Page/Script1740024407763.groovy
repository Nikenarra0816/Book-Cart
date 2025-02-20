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
import com.kms.katalon.core.util.KeywordUtil

WebUI.click(findTestObject('OR-Cart/ImgBook'))

String action = 'add_to_wishlist'

switch (action) {
	case 'add_to_cart':
		WebUI.click(findTestObject('OR-BookDetails/btn-addcart'))
		//WebUI.verifyElementPresent(findTestObject('OR-Cart/icon-cart'), 5)
		WebUI.delay(1) 
	break
	case 'add_to_wishlist':
		WebUI.click(findTestObject('OR-BookDetails/btn-addwishlist')) 
		//WebUI.verifyElementPresent(findTestObject('OR-Whislist/icon-wishlist'), 5)
		WebUI.delay(1) 
	default:
		KeywordUtil.logInfo("Invalid action, no test executed.")
}


