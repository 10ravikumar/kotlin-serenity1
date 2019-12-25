package com.test.config

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity::class)
@CucumberOptions(
        glue = arrayOf("com.test"),
        features = arrayOf("src/test/resources/features/")
)
class CucumberRunner {}
