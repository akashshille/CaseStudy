package com.nse.service;

import java.util.List;

import com.nse.entity.Portfolio;

@org.springframework.stereotype.Service
public interface Service {

	public Portfolio createPortfolio(Portfolio p);

	public List<Portfolio> showPortfolio();

	public boolean buyShare(Integer shareId, Integer portfolioId);

	public boolean sellShare(Integer shareId, Integer portfolioId);
}