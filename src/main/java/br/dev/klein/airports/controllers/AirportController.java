
package br.dev.klein.airports.controllers;

import br.dev.klein.airports.entities.Airport;
import br.dev.klein.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AirportController {
    @Autowired
    private AirportService aiportService;
    
    @GetMapping("/airport")
    public List<Airport> findAll() {
        List<Airport> result = aiportService.findAll();
        return result;   }
            
}
