/*
 * @(#)MsTransactionRepository.java 1.0.0 12/05/25
 * 
 * Copyright 2025 FEMSA Comercio, OXXO. All rights reserved.
 * OXXO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.femsa.oxxo.voucher.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.femsa.oxxo.voucher.entity.MsTransaction;

/**
 * Repository para la entity MsTransaction
 *
 * @author GTIM
 * @version 1.0.0, 12/05/25
 * @since 1.0.0
 *
 */
@Repository
public interface MsTransactionRepository extends ReactiveCrudRepository<MsTransaction, Long>{

}
