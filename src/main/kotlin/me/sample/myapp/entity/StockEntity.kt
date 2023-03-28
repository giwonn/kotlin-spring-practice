package me.sample.myapp.entity

import java.time.LocalDateTime
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import me.sample.myapp.model.Stock

@Entity
@Table(name = "stocks")
class StockEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: String,
    val type: String,
    val name: String,
    val code: String,
    val ticker: String,
    val updatedDate: LocalDateTime,
    val createdDate: LocalDateTime,
)

fun StockEntity.toModel(): Stock {
    return Stock(
        id = this.id,
        type = this.type,
        name = this.name,
        code = this.code,
        ticker = this.ticker,
    )
}
