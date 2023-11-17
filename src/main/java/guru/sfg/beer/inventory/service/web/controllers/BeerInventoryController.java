package guru.sfg.beer.inventory.service.web.controllers;

import guru.sfg.beer.inventory.service.repositories.BeerInventoryRepository;
import guru.sfg.beer.inventory.service.web.mappers.BeerInventoryMapper;
import guru.sfg.brewery.model.BeerInventoryDto;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BeerInventoryController {

  private final BeerInventoryRepository beerInventoryRepository;
  private final BeerInventoryMapper beerInventoryMapper;

  public BeerInventoryController(
      BeerInventoryRepository beerInventoryRepository, BeerInventoryMapper beerInventoryMapper) {
    this.beerInventoryRepository = beerInventoryRepository;
    this.beerInventoryMapper = beerInventoryMapper;
  }

  @GetMapping("api/v1/beer/{beerId}/inventory")
  List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId) {
    log.debug("Finding Inventory for beerId:" + beerId);

    return beerInventoryRepository.findAllByBeerId(beerId).stream()
        .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
        .toList();
  }
}
