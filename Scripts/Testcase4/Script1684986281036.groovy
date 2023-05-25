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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://phptravels.com/')

WebUI.click(findTestObject('Page_Phptravels/iconLivechat'))

WebUI.switchToFrame(findTestObject('Page_Phptravels/iframe/iframe_livechat'), 0)

WebUI.setText(findTestObject('Page_Phptravels/iframe/inputMesssage'), 'hello')

WebUI.click(findTestObject('Page_Phptravels/iframe/buttonSendMessage'))

not_run: CustomKeywords.'FileUpload.uploadFile'(findTestObject('null'), 'C:\\Users\\Hi\\Katalon Studio\\Exercise-Katalon\\image\\filetc4.jpg')
String projectDir = RunConfiguration.getProjectDir()

String FilePath = projectDir + '/image/filetc4.jpg'

WebUI.uploadFile(findTestObject('Page_Phptravels/iframe/input_file'),FilePath)

WebUI.verifyElementNotClickable(findTestObject('Page_Phptravels/iframe/input_file'))

