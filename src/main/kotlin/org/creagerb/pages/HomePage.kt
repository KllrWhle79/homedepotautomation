package org.creagerb.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class HomePage(private val driver: WebDriver) {
    @FindBy(id = "beginButton")
    private val beginButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun clickBegin() {
        beginButton?.click()
    }
}