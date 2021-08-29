package MockitoExampleJunitTest;

import MockitoExampleJunit.Portfolio;
import MockitoExampleJunit.Stock;
import MockitoExampleJunit.StockService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PortfolioTest {
    Portfolio portfolio;
    StockService stockService;

    public static void main(String[] args){
        PortfolioTest test=new PortfolioTest();
        test.setUp();
        System.out.println(test.marketValueTest());


    }
    public void setUp(){
        portfolio=new Portfolio();
        stockService=mock(StockService.class);
        portfolio.setStockService(stockService);
    }
    public boolean marketValueTest(){
        List<Stock> stockList=new ArrayList<Stock>();
           Stock googleStock=new Stock("1","Google",10);
        Stock microsoftStock=new Stock("2","Microsoft",20);
        stockList.add(googleStock);
        stockList.add(microsoftStock);
        portfolio.setStocks(stockList);
        when(stockService.getPrice(googleStock)).thenReturn(50.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);
        double marketValue = portfolio.getMarketValue();
        return marketValue == 100500.0;
    }
}
