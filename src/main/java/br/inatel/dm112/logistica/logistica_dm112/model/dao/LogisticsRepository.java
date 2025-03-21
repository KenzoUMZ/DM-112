package br.inatel.dm112.logistica.logistica_dm112.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.dm112.logistica.logistica_dm112.model.entities.OrderEntity;

@Repository
public interface LogisticsRepository extends JpaRepository<OrderEntity, Integer> {

}
