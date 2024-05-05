package net.bddtrader.stepdefinitions;

import com.serenitydojo.news.NewsItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bddtrader.testdata.NewsItemTestData;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;


public class NewsStepDefinitions {
    @Given("{word} has a trading account")
    public void tracy_has_a_trading_account(String traderName) {
        //TODO : create an account for the trader

    }
    @Given("the following articles have been published:")
    public void the_following_articles_have_been_published(List<Map<String, String>> newsArticleData) {
        List<NewsItem> newsArticles
                = newsArticleData.stream()
                .map(articleData -> NewsItemTestData.newsItemFrom(articleData))
                .toList();

        System.out.println("populated news article: "+newsArticles);

    }
    @When("she views the latest news articles")
    public void she_views_the_latest_news_articles() {

    }
    @When("she views he latest news articles")
    public void she_views_he_latest_news_articles() {

    }
    @Then("the articles should be presented as follows:")
    public void the_articles_should_be_presented_as_follows(io.cucumber.datatable.DataTable dataTable) {

    }
}
