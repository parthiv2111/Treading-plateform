package com.parthiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthiv.domain.WalletTransactionType;
import com.parthiv.model.Wallet;
import com.parthiv.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
