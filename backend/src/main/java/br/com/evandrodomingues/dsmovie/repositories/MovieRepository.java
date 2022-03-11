package br.com.evandrodomingues.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.evandrodomingues.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
