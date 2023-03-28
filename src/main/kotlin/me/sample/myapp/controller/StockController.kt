package me.sample.myapp.controller

import me.sample.myapp.model.Stock
import me.sample.myapp.service.StockQueryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(private val stockService: StockQueryService) {
    @GetMapping("/stocks")
    fun listStocks(): List<Stock> {
        return stockService.getStocks()
    }
}
