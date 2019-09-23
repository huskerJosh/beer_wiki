package com.beer.wiki.server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Josh on 9/22/19.
 */
@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
