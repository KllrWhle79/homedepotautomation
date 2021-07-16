package org.creagerb

import org.creagerb.pages.HomePage
import org.creagerb.pages.LoginBtnPage
import org.creagerb.pages.NextBtnPage
import org.creagerb.pages.ZipCodeBtnPage
import org.testng.annotations.Test


class SurveyTest() : TestBase() {
    @Test
    fun clickButtons() {
        val homePage = HomePage(driver)
        homePage.clickBegin()

        val zipCodeBtnPage = ZipCodeBtnPage(driver)
        zipCodeBtnPage.fillZipCode("85020")
        zipCodeBtnPage.clickNext()

        val nextBtnPage = NextBtnPage(driver)
        nextBtnPage.clickNext()

        val loginBtnPage = LoginBtnPage(driver)
        loginBtnPage.fillAuth("test", "test")
        loginBtnPage.clickNext()
    }
}