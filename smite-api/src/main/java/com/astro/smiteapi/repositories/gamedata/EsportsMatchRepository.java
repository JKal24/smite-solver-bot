package com.astro.smiteapi.repositories.gamedata;

import com.astro.smiteapi.models.gamedata.matches.EsportsMatchInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsportsMatchRepository extends CrudRepository<EsportsMatchInfo, Integer> {
}
