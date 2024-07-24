package org.ktb.chatbotbe;

import io.cucumber.java.en.*;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PasswordGenerationSteps {

    private static final Logger log = LoggerFactory.getLogger(PasswordGenerationSteps.class);

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;

    @Given("the user is on the password generation page")
    public void the_user_is_on_the_password_generation_page() {
        // No action needed as we're testing API directly
    }

    @When("the user enters a valid password and clicks the generate button")
    public void the_user_enters_a_valid_password_and_clicks_the_generate_button() throws Exception {
        MvcResult result = mockMvc.perform(post("/api/v1/passwords")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"password\": \"ValidPassword123!\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message", is("Password is valid")))
                .andDo(print())
                .andReturn();
        log.info(result.getResponse().getContentAsString());
    }

    @Then("the system should display a message indicating the password is valid")
    public void the_system_should_display_a_message_indicating_the_password_is_valid() {
        // No action needed as the validation is done in the previous step
    }

    @When("the user enters an invalid password and clicks the generate button")
    public void the_user_enters_an_invalid_password_and_clicks_the_generate_button() throws Exception {
        MvcResult result = mockMvc.perform(post("/api/v1/passwords")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"password\": \"123\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message", is("Password is invalid")))
                .andDo(print())
                .andReturn();
        log.info(result.getResponse().getContentAsString());
    }

    @Then("the system should display a message indicating the password is invalid")
    public void the_system_should_display_a_message_indicating_the_password_is_invalid() {
        // No action needed as the validation is done in the previous step
    }
}
