package org.creagerb.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.How
import org.openqa.selenium.support.PageFactory

open class NextBtnPage(private val driver: WebDriver) {
    @FindBy(id = "nextButton")
    private val nextButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun clickNext() {
        nextButton?.click()
    }
}

class ZipCodeBtnPage(private val driver: WebDriver) : NextBtnPage(driver) {
    @FindBy(how = How.CLASS_NAME, using = "input-field")
    private val zipCodeField: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun fillZipCode(zipcode: String) {
        zipCodeField?.sendKeys(zipcode)
    }
}

class LoginBtnPage(private val driver: WebDriver) : NextBtnPage(driver) {
    @FindBy(how = How.NAME, using = "spl_q_thd_receiptcode_id_entry_text")
    private val usernameField: WebElement? = null

    @FindBy(how = How.NAME, using = "spl_q_thd_receiptcode_password_entry_text")
    private val passwordField: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun fillAuth(username: String, password: String) {
        usernameField?.sendKeys(username)
        passwordField?.sendKeys(password)
    }
}