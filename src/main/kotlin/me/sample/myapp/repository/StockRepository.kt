package me.sample.myapp.repository

import me.sample.myapp.entity.StockEntity
import me.sample.myapp.entity.toModel
import me.sample.myapp.model.Stock
import org.springframework.data.jpa.repository.JpaRepository

interface StockRepository: JpaRepository<StockEntity, String>
