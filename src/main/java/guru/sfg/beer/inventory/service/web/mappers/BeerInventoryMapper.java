package guru.sfg.beer.inventory.service.web.mappers;

import guru.sfg.beer.inventory.service.domain.BeerInventory;
import guru.sfg.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

  BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

  BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
