package me.sample.myapp.service

import me.sample.myapp.entity.toModel
import me.sample.myapp.model.Stock
import me.sample.myapp.repository.StockRepository
import org.springframework.stereotype.Service

@Service
class StockQueryService(private val stockRepository: StockRepository) {
    fun getStocks(): List<Stock> = stockRepository.findAll().map { it.toModel() }
}
