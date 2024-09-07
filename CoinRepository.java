package com.parthiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthiv.model.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
