package br.com.alura.microservice.provider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.provider.model.InfoProvider;
import br.com.alura.microservice.provider.repository.InfoRepository;

@Service
public class InfoService {
	
	private static final Logger LOG = LoggerFactory.getLogger(InfoService.class);
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoProvider getInfoByState(String state) {
		
		LOG.info("Finding information by state {}", state);
		return infoRepository.findByState(state);
		
	}
}	
