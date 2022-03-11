package br.com.evandrodomingues.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.evandrodomingues.dsmovie.entities.Score;
import br.com.evandrodomingues.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
