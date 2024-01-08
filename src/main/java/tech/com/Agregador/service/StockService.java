package tech.com.Agregador.service;

import org.springframework.stereotype.Service;
import tech.com.Agregador.entity.Stock;
import tech.com.Agregador.controller.dto.CreateStockDto;
import tech.com.Agregador.repository.StockRepository;

@Service
public class StockService {

    private StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void createStock(CreateStockDto createStockDto) {

        // DTO -> ENTITY
        var stock = new Stock(
            createStockDto.stockId(),
            createStockDto.description()
        );

        stockRepository.save(stock);
    }
}
