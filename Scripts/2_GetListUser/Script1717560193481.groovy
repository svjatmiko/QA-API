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

ResponseUser = WS.sendRequest(findTestObject('ListUser'))

WS.verifyResponseStatusCode(ResponseUser, 200)

WS.verifyElementPropertyValue(ResponseUser, 'data[0].id', '1')

WS.verifyElementPropertyValue(ResponseUser, 'data[0].email', 'george.bluth@reqres.in')

WS.verifyElementPropertyValue(ResponseUser, 'data[0].first_name', 'George')

WS.verifyElementPropertyValue(ResponseUser, 'data[0].last_name', 'Bluth')

WS.verifyElementPropertyValue(ResponseUser, 'data[0].avatar', 'https://reqres.in/img/faces/1-image.jpg')

