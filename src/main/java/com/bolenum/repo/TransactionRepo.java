/**
 * 
 */
package com.bolenum.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolenum.model.Transaction;

/**
 * @author chandan kumar singh
 * @date 29-Sep-2017
 */
public interface TransactionRepo extends JpaRepository<Transaction, Serializable> {

	/**
	 * @description findByTxHash
	 * 
	 */
	Transaction findByTxHash(String txHash);

}
