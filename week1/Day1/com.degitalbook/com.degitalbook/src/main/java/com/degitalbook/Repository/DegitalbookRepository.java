package com.degitalbook.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.degitalbook.entity.DegitalBookEntity;

@Repository
public interface DegitalbookRepository extends JpaRepository<DegitalBookEntity, Long>{

}
