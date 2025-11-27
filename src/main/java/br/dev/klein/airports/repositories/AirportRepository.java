package br.dev.klein.airports.repositories;

import br.dev.klein.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long>{
    
}
