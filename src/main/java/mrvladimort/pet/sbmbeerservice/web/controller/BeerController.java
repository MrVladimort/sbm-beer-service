package mrvladimort.pet.sbmbeerservice.web.controller;

import lombok.RequiredArgsConstructor;
import mrvladimort.pet.sbmbeerservice.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
@RequiredArgsConstructor
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeersById(@PathVariable("beerId") UUID beerId) {
        // todo impl
        return new ResponseEntity<BeerDTO>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> saveNewBeer(@RequestBody BeerDTO beerDto) {
        // todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeerById(@PathVariable("beerId") UUID beerId) {
        // todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
